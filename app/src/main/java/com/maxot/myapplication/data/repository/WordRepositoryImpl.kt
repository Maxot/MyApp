package com.maxot.myapplication.data.repository

import androidx.lifecycle.LiveData
import com.maxot.myapplication.data.database.AppDatabase
import com.maxot.myapplication.data.database.dao.WordDao
import com.maxot.myapplication.data.database.entity.Word
import javax.inject.Inject

class WordRepositoryImpl @Inject constructor(
    private val wordDao: WordDao
): WordRepository{
    override val allWords: LiveData<List<Word>> = wordDao.getAll()

    override fun getWords() : String {
        return "Hello world"
    }

    override suspend fun addWord(word: Word){
        wordDao.insert(word)
    }
}