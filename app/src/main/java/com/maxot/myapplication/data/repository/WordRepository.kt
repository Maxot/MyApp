package com.maxot.myapplication.data.repository

import androidx.lifecycle.LiveData
import com.maxot.myapplication.data.database.entity.Word

interface WordRepository {
    val allWords: LiveData<List<Word>>

    fun getWords(): String
    suspend fun addWord(word: Word)
}