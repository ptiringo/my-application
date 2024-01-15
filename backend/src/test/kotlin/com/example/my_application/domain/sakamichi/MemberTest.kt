package com.example.my_application.domain.sakamichi

import com.example.my_application.domain.sakamichi.group.Generation
import com.example.my_application.domain.sakamichi.group.Group
import com.example.my_application.domain.sakamichi.member.Member
import com.example.my_application.domain.sakamichi.member.Name
import io.mockk.every
import io.mockk.mockkStatic
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Nested
import org.junit.jupiter.api.Test
import java.time.LocalDate


class MemberTest {

    @Nested
    inner class AgeTest {
        @Test
        fun testAge() {
            val member = Member(
                name = Name("テスト", "テスト", "テスト", "テスト"),
                dateOfBirth = LocalDate.of(2010, 3, 10),
                generation = Generation(
                    group = Group(name = "テスト", formationDate = LocalDate.of(2000, 1, 1)),
                    joinDate = LocalDate.of(2000, 1, 1)
                )
            )

            mockkStatic(LocalDate::class)

            every { LocalDate.now() } returns LocalDate.of(2020, 3, 9)
            assertThat(member.age).isEqualTo(9)

            every { LocalDate.now() } returns LocalDate.of(2020, 3, 10)
            assertThat(member.age).isEqualTo(10)
        }
    }

    @Nested
    inner class IsCurrentlyBreakOfActivityTest {

        private lateinit var member: Member

        @BeforeEach
        fun setUp() {
            this.member = Member(
                name = Name("テスト", "テスト", "テスト", "テスト"),
                dateOfBirth = LocalDate.of(2010, 3, 10),
                generation = Generation(
                    group = Group(name = "テスト", formationDate = LocalDate.of(2000, 1, 1)),
                    joinDate = LocalDate.of(2000, 1, 1)
                )
            )
        }

        @Test
        @DisplayName("活動休止したことがない場合はfalseを返す")
        fun testIfBreakOfActivity() {
            assertThat(this.member.isCurrentlyBreakOfActivity).isFalse()
        }

        @Test
        @DisplayName("活動休止中の場合はtrueを返す")
        fun testIsCurrentlyBreakOfActivity() {
            this.member.startBreakOfActivity(LocalDate.of(2020, 1, 1))
            assertThat(this.member.isCurrentlyBreakOfActivity).isTrue()
        }

        @Test
        @DisplayName("活動休止したことがあるが、すでに活動再開済みの場合はfalseを返す")
        fun testHasBeenBreakOfActivityButComebacked() {
            this.member.startBreakOfActivity(LocalDate.of(2020, 1, 1))
            this.member.comeBack(LocalDate.of(2020, 2, 1))
            assertThat(this.member.isCurrentlyBreakOfActivity).isFalse()
        }
    }
}
