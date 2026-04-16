package com.example.magnet.social.domain.repository

import com.example.magnet.social.domain.model.Magnet
import kotlinx.coroutines.flow.Flow

interface MagnetRepository{
    fun getAllMagnets() : Flow<List<Magnet>>
    suspend fun saveMagnet(magnet: Magnet)
    suspend fun getMagnetById(id : String) : Magnet?
    suspend fun deleteMagnet(magnet: Magnet)
}