package com.example.magnet.social.domain.model

data class Magnet(
    val  id : String,
    val imageUrl : String,
    val latitude : Double,
    val longitude : Double,
    val placeName : String,
    val timestamp: Long,
    val magnetPower : Int
)