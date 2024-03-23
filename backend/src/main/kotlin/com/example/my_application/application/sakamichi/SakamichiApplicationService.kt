package com.example.my_application.application.sakamichi

import com.example.my_application.domain.sakamichi.group.Generation
import com.example.my_application.domain.sakamichi.group.Group
import com.example.my_application.domain.sakamichi.live.Live
import com.example.my_application.domain.sakamichi.member.BreakOfActivity
import com.example.my_application.domain.sakamichi.member.Member
import com.example.my_application.domain.sakamichi.member.Name
import com.example.my_application.domain.sakamichi.member.ReturnToActivity
import com.example.my_application.domain.sakamichi.single.Single
import com.example.my_application.infrastructure.sakamichi.group.GroupRepository
import com.example.my_application.infrastructure.sakamichi.live.LiveRepository
import com.example.my_application.infrastructure.sakamichi.member.MemberRepository
import com.example.my_application.infrastructure.sakamichi.single.SingleRepository
import java.time.LocalDate
import javax.enterprise.context.ApplicationScoped
import javax.transaction.Transactional

@Transactional
@ApplicationScoped
class SakamichiApplicationService(
    private val groupRepository: GroupRepository,
    private val memberRepository: MemberRepository,
    private val singleRepository: SingleRepository,
    private val liveRepository: LiveRepository
) {
    /** グループ結成 */
    fun createNewGroup(createNewGroupCommand: CreateNewGroupCommand): Pair<Group, Generation> {
        val group = Group(
            name = createNewGroupCommand.groupName,
            formationDate = createNewGroupCommand.formationDate
        )

        val initialGeneration = Generation(
            group = group,
            joinDate = group.formationDate
        )

        createNewGroupCommand.initialMembers.map {
            Member(
                name = Name(
                    firstName = it.firstName,
                    familyName = it.familyName,
                    firstNameKana = it.firstNameKana,
                    familyNameKana = it.familyNameKana,
                    middleName = it.middleName,
                ),
                dateOfBirth = it.dateOfBirth,
                generation = initialGeneration
            )
        }

        groupRepository.persist(group)
        groupRepository.flush()

        return group to initialGeneration
    }

    /** 新メンバー加入 */
    fun joinNewMembers(joinNewMembersCommand: JoinNewMembersCommand): Generation {
        val group = groupRepository.findById(joinNewMembersCommand.groupId)!!

        val generation = Generation(
            group = group,
            joinDate = joinNewMembersCommand.joinDate
        )

        joinNewMembersCommand.newMembers.map {
            Member(
                name = Name(
                    firstName = it.firstName,
                    familyName = it.familyName,
                    firstNameKana = it.firstNameKana,
                    familyNameKana = it.familyNameKana,
                    middleName = it.middleName,
                ),
                dateOfBirth = it.dateOfBirth,
                generation = generation
            )
        }

        groupRepository.flush()
        return generation
    }

    /** シングルリリース */
    fun releaseNewSingle(command: ReleaseNewSingleCommand): Single {
        val single = Single(
            number = command.number,
            title = command.title,
            group = groupRepository.findById(command.groupId)!!,
            releaseDate = command.releaseDate
        )
        singleRepository.persist(single)
        return single
    }

    /** 活動休止 */
    fun startBreakOfActivity(memberId: Long, startAt: LocalDate): BreakOfActivity {
        val member = memberRepository.findById(memberId)!!
        return member.startBreakOfActivity(startAt)
    }

    /** 活動再開 */
    fun comeBack(memberId: Long, endAt: LocalDate): ReturnToActivity {
        val member = memberRepository.findById(memberId)!!
        return member.comeBack(endAt)
    }

    /** 卒業 */
    fun graduate(memberId: Long, leavedDate: LocalDate) {
        val member = memberRepository.findById(memberId)!!
        member.graduate(leavedDate)
    }

    /** 活動辞退 */
    fun withdrawFromActivity(memberId: Long, leavedDate: LocalDate) {
        val member = memberRepository.findById(memberId)!!
        member.withdrawFromActivity(leavedDate)
    }

    /** ライブ開催 */
    fun holdLive(command: HoldLiveCommand): Live {
        val group = groupRepository.findById(command.groupId)!!
        val live = Live(group = group, title = command.title)
        liveRepository.persist(live)
        return live
    }

}
