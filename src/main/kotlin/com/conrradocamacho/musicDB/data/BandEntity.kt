package com.conrradocamacho.musicDB.data

import javax.persistence.*

@Entity
@Table(name = "band")
class BandEntity(
    @Column(name = "name")
    val name: String = "Name of the band",

    @Column(name = "description")
    val description: String = "Description of the band",

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Int = 0
) {
}