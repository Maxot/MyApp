package com.maxot.myapplication.di.module

import android.app.Application
import android.content.Context
import com.maxot.myapplication.data.database.dao.WordDao
import com.maxot.myapplication.data.repository.WordRepository
import com.maxot.myapplication.data.repository.WordRepositoryImpl
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class AppModule {

    @Provides
    @Singleton
    fun provideWordRepository(wordDao: WordDao): WordRepository {
        return WordRepositoryImpl(wordDao = wordDao)
    }
}