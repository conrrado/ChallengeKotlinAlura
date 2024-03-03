package org.example.com.conrradocamacho.musicDB.model

class Band(
    val name: String = "Name of the band",
    val description: String = "Description of the band",
    val id: Int = 0
) {
    override fun toString(): String {
        return "$name ($id)"
    }
}
