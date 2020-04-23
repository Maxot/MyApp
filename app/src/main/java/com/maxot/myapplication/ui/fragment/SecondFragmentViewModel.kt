package com.maxot.myapplication.ui.fragment

import com.maxot.myapplication.data.repository.WordRepository
import com.maxot.myapplication.data.repository.WordRepositoryImpl
import com.maxot.myapplication.ui.BaseViewModel
import javax.inject.Inject

class SecondFragmentViewModel @Inject constructor(
    private val repository: WordRepository
) : BaseViewModel() {

    fun getRepository(): WordRepository {
        return repository
    }
}
