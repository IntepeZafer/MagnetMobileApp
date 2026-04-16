package com.example.magnet.social.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.magnet.social.data.local.entity.MagnetEntity

@Database(entities = [MagnetEntity::class], version = 1)
abstract class MagnetDatabase : RoomDatabase() {
    abstract val dao: MagnetDao
}