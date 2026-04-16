package com.example.magnet.social.di

import android.app.Application
import androidx.room.Room
import com.example.magnet.social.data.local.MagnetDatabase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideMagnetDatabase(app: Application): MagnetDatabase {
        return Room.databaseBuilder(app, MagnetDatabase::class.java, "magnet_db").build()
    }
}