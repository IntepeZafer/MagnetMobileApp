package com.example.magnet.social.data.local

import androidx.room.*
import com.example.magnet.social.data.local.entity.MagnetEntity
import kotlinx.coroutines.flow.Flow

@Dao
interface MagnetDao{
    @Query("SELECT * FROM magnets ORDER BY timestamp DESC")
    fun getAllMagnets() : Flow<List<MagnetEntity>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertMagnet(magnet : MagnetEntity)

    @Delete
    suspend fun deleteMagnet(magnet : MagnetEntity)

    @Query("SELECT * FROM magnets WHERE id = :id")
    suspend fun getMagnetById(id : String) : MagnetEntity?
}