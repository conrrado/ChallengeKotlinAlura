package org.example.com.conrradocamacho.musicDB.model

data class Album(
    val title: String = "Title of album",
    val band: Band = Band(),
    val id: Int = 0
) {
    override fun toString(): String {
        return "$title ($id) - $band"
    }
}
