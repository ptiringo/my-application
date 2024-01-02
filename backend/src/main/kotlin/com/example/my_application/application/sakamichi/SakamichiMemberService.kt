package com.example.my_application.application.sakamichi

import com.example.my_application.domain.sakamichi.member.HinatazakaMember
import com.example.my_application.domain.sakamichi.member.NogizakaMember
import com.example.my_application.domain.sakamichi.member.SakurazakaMember
import com.example.my_application.infrastructure.sakamichi.member.HinatazakaMemberRepository
import com.example.my_application.infrastructure.sakamichi.member.NogizakaMemberRepository
import com.example.my_application.infrastructure.sakamichi.member.SakurazakaMemberRepository
import javax.enterprise.context.ApplicationScoped
import javax.inject.Inject
import javax.transaction.Transactional

@ApplicationScoped
class SakamichiMemberService {

    @Inject
    lateinit var nogizakaMemberRepository: NogizakaMemberRepository

    @Inject
    lateinit var sakurazakaMemberRepository: SakurazakaMemberRepository

    @Inject
    lateinit var hinatazakaMemberRepository: HinatazakaMemberRepository

    @Transactional
    fun registerNogizakaMembers(nogizakaMembers: Iterable<NogizakaMember>) {
        nogizakaMemberRepository.persist(nogizakaMembers)
    }

    @Transactional
    fun registerSakurazakaMembers(sakurazakaMembers: Iterable<SakurazakaMember>) {
        sakurazakaMemberRepository.persist(sakurazakaMembers)
    }

    @Transactional
    fun registerHinatazakaMembers(hinatazakaMembers: Iterable<HinatazakaMember>) {
        hinatazakaMemberRepository.persist(hinatazakaMembers)
    }

    @Transactional
    fun registerHinatazakaMembers(vararg hinatazakaMembers: HinatazakaMember) {
        this.registerHinatazakaMembers(listOf(*hinatazakaMembers))
    }

}
