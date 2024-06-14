package com.example.my_application.application.sakamichi

import java.time.LocalDate
import java.time.LocalTime

/** ライブ開催コマンド */
class HoldLiveCommand(
    /** グループID */
    val groupId: Long,

    /** 公演名 */
    val title: String,

    /** 公演スケジュール */
    val schedules: List<HoldLiveScheduleInfo>
)

/** ライブスケジュール情報 */
class HoldLiveScheduleInfo(
    /** 日付 */
    val date: LocalDate,

    /** 会場 */
    val venue: String,

    /** 開場時刻 */
    val openAt: LocalTime,

    /** 開演時刻 */
    val startAt: LocalTime,
)
