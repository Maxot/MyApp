package com.maxot.myapplication.di.module

import android.content.Context
import androidx.room.Room
import androidx.room.RoomDatabase
import com.maxot.myapplication.Constants
import com.maxot.myapplication.data.database.AppDatabase
import com.maxot.myapplication.data.database.dao.WordDao
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class RoomModule{
    @Singleton
    @Provides
    fun provideDataBase(context: Context): AppDatabase{
        return Room.databaseBuilder(
            context.applicationContext,
            AppDatabase::class.java,
            Constants.DATABASE_NAME
        ).build()
    }

    @Singleton
    @Provides
    fun provideWordDao(db: AppDatabase): WordDao{
        return db.wordDao()
    }
}