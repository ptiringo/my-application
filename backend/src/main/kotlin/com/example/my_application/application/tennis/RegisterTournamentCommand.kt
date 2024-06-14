package com.example.my_application.application.tennis

import com.example.my_application.domain.tennis.tournament.TennisSurface
import com.example.my_application.domain.tennis.tournament.TournamentCategory

/** トーナメント登録コマンド */
data class RegisterTournamentCommand(
    /** トーナメント名 */
    val name: String,

    /** 開催場所 */
    val location: String,

    /** 大会カテゴリ */
    val tournamentCategory: TournamentCategory,

    /** サーフェス */
    val tennisSurface: TennisSurface,
)
