package com.conrradocamacho.musicDB.main

import com.conrradocamacho.musicDB.data.BandDAO
import com.conrradocamacho.musicDB.data.Database
import com.conrradocamacho.musicDB.model.Band

fun main() {
    val manager = Database.getEntityManager()

    val bandDAO = BandDAO(manager)
    showBandList(bandDAO)

//    val titas = Band("Titãs")
//    val legiao = Band("Legião Urbana")
//
//    bandDAO.add(titas)
//    bandDAO.add(legiao)
//    showBandList(bandDAO)

    manager.close()
}

fun showBandList(bandDAO: BandDAO) {
    println("\nBand List:\n ${bandDAO.getList()} \n")
}
