package com.example.my_application.application.sakamichi

import java.time.LocalDate

data class ReleaseNewSingleCommand(
    val groupId: Long,
    val number: Int,
    val title: String,
    val releaseDate: LocalDate,
)
