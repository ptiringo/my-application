package com.example.my_application.domain.horse_racing

import io.mockk.every
import io.mockk.mockkStatic
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import java.time.LocalDate

class RacehorseTest {

    @Test
    fun getAge() {
        val horse = Racehorse(name = "テスト", dateOfBirth = LocalDate.of(2005, 3, 10))

        mockkStatic(LocalDate::class)

        every { LocalDate.now() } returns LocalDate.of(2008, 12, 31)
        assertThat(horse.age).isEqualTo(3)

        every { LocalDate.now() } returns LocalDate.of(2009, 1, 1)
        assertThat(horse.age).isEqualTo(4)
    }
}
