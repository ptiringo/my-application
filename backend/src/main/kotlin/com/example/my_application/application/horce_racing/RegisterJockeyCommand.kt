package com.example.my_application.application.horce_racing

class RegisterJockeyCommand(
    val firstNameKana: String,
    val familyNameKana: String,
    val firstNameKanji: String? = null,
    val familyNameKanji: String? = null,
    val firstNameAlphabet: String? = null,
    val familyNameAlphabet: String? = null,
)
