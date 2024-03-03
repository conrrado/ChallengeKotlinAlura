package com.conrradocamacho.musicDB.extensions

import com.conrradocamacho.musicDB.data.AlbumEntity
import com.conrradocamacho.musicDB.model.Album

fun Album.toEntity(): AlbumEntity {
    return AlbumEntity(this.title, this.band.toEntity(), this.id)
}

fun  AlbumEntity.toModel(): Album {
    return Album(this.title, this.band.toModel(), this.id)
}