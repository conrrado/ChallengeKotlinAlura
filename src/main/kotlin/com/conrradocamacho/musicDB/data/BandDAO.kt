package com.conrradocamacho.musicDB.data

import com.conrradocamacho.musicDB.extensions.toEntity
import com.conrradocamacho.musicDB.extensions.toModel
import com.conrradocamacho.musicDB.model.Band
import javax.persistence.EntityManager

class BandDAO(manager: EntityManager): DAO<Band, BandEntity>(manager, BandEntity::class.java) {
    override fun toEntity(obj: Band): BandEntity {
        return obj.toEntity()
    }

    override fun toModel(entity: BandEntity): Band {
        return entity.toModel()
    }
}