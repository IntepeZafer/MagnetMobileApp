package com.example.magnet.social.data.local.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "magnets")
data class MagnetEntity(
    @PrimaryKey val  id : String,
    val imageUrl : String,
    val latitude : Double,
    val longitude : Double,
    val placeName : String,
    val timestamp: Long,
    val magnetPower : Int
)