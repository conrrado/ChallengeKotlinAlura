package com.conrradocamacho.musicDB.extensions

import com.conrradocamacho.musicDB.data.BandEntity
import com.conrradocamacho.musicDB.model.Band

fun Band.toEntity(): BandEntity {
    return BandEntity(this.name, this.description, this.id)
}

fun BandEntity.toModel(): Band {
    return Band(this.name, this.description, this.id)
}
