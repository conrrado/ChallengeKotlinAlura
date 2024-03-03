package org.example.com.conrradocamacho.musicDB.main

import org.example.com.conrradocamacho.musicDB.model.Album
import org.example.com.conrradocamacho.musicDB.model.Band

fun main() {
    val titas = Band("Titãs")
    val goBack = Album("Go Back", titas)
    val cabecaDinossauro = Album("Cabeça Dinossauro", titas)

    println(titas)
    println(goBack)
    println(cabecaDinossauro)
}