package com.conrradocamacho.musicDB.data

import com.conrradocamacho.musicDB.extensions.toEntity
import com.conrradocamacho.musicDB.extensions.toModel
import com.conrradocamacho.musicDB.model.Album
import javax.persistence.EntityManager

class AlbumDAO(manager: EntityManager): DAO<Album, AlbumEntity>(manager, AlbumEntity::class.java) {
    override fun toEntity(obj: Album): AlbumEntity {
        return obj.toEntity()
    }

    override fun toModel(entity: AlbumEntity): Album {
        return entity.toModel()
    }
}