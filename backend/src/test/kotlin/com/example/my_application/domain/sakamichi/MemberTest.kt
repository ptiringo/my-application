package com.example.my_application.domain.sakamichi

import com.example.my_application.domain.sakamichi.group.Generation
import com.example.my_application.domain.sakamichi.group.Group
import com.example.my_application.domain.sakamichi.member.Member
import com.example.my_application.domain.sakamichi.member.Name
import io.mockk.every
import io.mockk.mockkStatic
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import java.time.LocalDate

class MemberTest {

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
