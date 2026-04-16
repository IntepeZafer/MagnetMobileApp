package com.example.magnet.social.data.mapper

import com.example.magnet.social.data.local.entity.MagnetEntity
import com.example.magnet.social.domain.model.Magnet

fun MagnetEntity.toMagnet() = Magnet(id , imageUrl , latitude , longitude , placeName , timestamp , magnetPower)
fun Magnet.toMagnetEntity() = MagnetEntity(id , imageUrl , latitude , longitude , placeName , timestamp , magnetPower)