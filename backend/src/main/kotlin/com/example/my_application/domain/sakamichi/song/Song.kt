package com.example.my_application.domain.sakamichi.song

import com.example.my_application.domain.sakamichi.release_package.PackageSong
import javax.persistence.*

/** 曲 */
@Entity
class Song(
    /** 曲名 */
    val title: String,

    @OneToOne
    val formation: Formation,

    @ManyToMany
    val packageSongs: List<PackageSong> = emptyList(),
) {
    @Id
    @GeneratedValue
    val id: Long = 0
}
