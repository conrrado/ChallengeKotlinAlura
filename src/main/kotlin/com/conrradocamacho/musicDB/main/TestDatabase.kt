package com.conrradocamacho.musicDB.main

import com.conrradocamacho.musicDB.data.AlbumDAO
import com.conrradocamacho.musicDB.data.BandDAO
import com.conrradocamacho.musicDB.data.Database
import com.conrradocamacho.musicDB.model.Album
import com.conrradocamacho.musicDB.model.Band

fun main() {
    val manager = Database.getEntityManager()
    val bandDAO = BandDAO(manager)
    val albumDAO = AlbumDAO(manager)

    showBandList(bandDAO)

//    val titas = Band("Titãs")
//    val legiao = Band("Legião Urbana")

    // Add new bands
//    bandDAO.add(titas)
//    bandDAO.add(legiao)
//    showBandList(bandDAO)

    // Remove duplicate items
//    bandDAO.delete(3)
//    bandDAO.delete(4)
//    showBandList(bandDAO)

    // Add album to band Titãs
//    val titas = bandDAO.getById(1)
//    val acusticoMTV = Album("Acústico MTV", titas)
//    val cabecaDinossauro = Album("Cabeça Dinossauro", titas)
//    albumDAO.add(acusticoMTV)
//    albumDAO.add(cabecaDinossauro)

    // Add album to band Legião Urbana
//    val legiao = bandDAO.getById(2)
//    val acusticoMTV = Album("Acústico MTV", legiao)
//    albumDAO.add(acusticoMTV)

    // Remove duplicate album from Legião Urbana
//    albumDAO.delete(4)

    println("\nAlbum list:\n${albumDAO.getList()}\n")

    manager.close()
}

fun showBandList(bandDAO: BandDAO) {
    println("\nBand List:\n${bandDAO.getList()}\n")
}
