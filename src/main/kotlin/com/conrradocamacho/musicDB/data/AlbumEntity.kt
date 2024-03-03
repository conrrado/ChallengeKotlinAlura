package com.conrradocamacho.musicDB.data

import javax.persistence.*

@Entity
@Table(name = "album")
class AlbumEntity(
    @Column(name = "title")
    val title: String = "Title of the album",

    @ManyToOne
    val band: BandEntity = BandEntity(),

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Int = 0
) {
}