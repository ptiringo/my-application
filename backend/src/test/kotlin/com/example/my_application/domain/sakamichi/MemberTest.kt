package com.example.my_application.domain.sakamichi

import com.example.my_application.domain.sakamichi.member.BecomingNogizakaMember
import com.example.my_application.domain.sakamichi.member.Name
import com.example.my_application.domain.sakamichi.member.NogizakaMember
import io.mockk.every
import io.mockk.mockkStatic
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import java.time.LocalDate

class MemberTest {

    @Test
    fun testAge() {
        val member = NogizakaMember(
            Name("テスト", "テスト", "テスト", "テスト"),
            LocalDate.of(2010, 3, 10),
            BecomingNogizakaMember.FIRST
        )

        mockkStatic(LocalDate::class)

        every { LocalDate.now() } returns LocalDate.of(2020, 3, 9)
        assertThat(member.age).isEqualTo(9)

        every { LocalDate.now() } returns LocalDate.of(2020, 3, 10)
        assertThat(member.age).isEqualTo(10)
    }
}
