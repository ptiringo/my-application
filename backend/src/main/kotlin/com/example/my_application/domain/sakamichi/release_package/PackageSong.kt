package com.example.my_application.domain.sakamichi.release_package

import com.example.my_application.domain.sakamichi.song.Song
import javax.persistence.*

@Entity
class PackageSong(

    val number: Int,

    @ManyToOne
    val releasePackage: ReleasePackage,

    @ManyToMany(
        mappedBy = "packageSongs",
        cascade = [CascadeType.ALL],
        fetch = FetchType.LAZY
    )
    val songs: List<Song> = emptyList(),
) {
    @Id
    val id: Long = 0
}
