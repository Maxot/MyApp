package com.maxot.myapplication.data.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.maxot.myapplication.Constants
import com.maxot.myapplication.data.database.dao.WordDao
import com.maxot.myapplication.data.database.entity.Word

@Database(entities = [Word::class], version = Constants.DATABASE_VERSION, exportSchema = false)
abstract class AppDatabase: RoomDatabase(){
    abstract fun wordDao() : WordDao
}