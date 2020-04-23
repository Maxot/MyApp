package com.maxot.myapplication.data.database.dao

import androidx.lifecycle.LiveData
import androidx.room.*
import com.maxot.myapplication.data.database.entity.Word

@Dao
interface WordDao {
    @Query("SELECT * FROM word_table")
    fun getAll(): LiveData<List<Word>>

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insert(word: Word)

    @Insert
    suspend fun InsertAll(vararg words: Word)

    @Delete
    suspend fun delete(word: Word)

    @Query("DELETE FROM word_table")
    suspend fun deleteAll()
}