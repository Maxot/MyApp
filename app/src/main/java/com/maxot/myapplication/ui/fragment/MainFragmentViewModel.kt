package com.maxot.myapplication.ui.fragment

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.maxot.myapplication.data.database.entity.Word
import com.maxot.myapplication.data.repository.WordRepository
import com.maxot.myapplication.data.repository.WordRepositoryImpl
import kotlinx.coroutines.launch
import javax.inject.Inject

class MainFragmentViewModel @Inject constructor(
    private val repository: WordRepository)
    : ViewModel() {
    val allWords: LiveData<List<Word>> = repository.allWords

    fun getRepository(): WordRepository {
        return repository
    }

    fun addWord(name: String, translate: String) = viewModelScope.launch {
            repository.addWord(Word(name = name, translate = translate))
        }

}