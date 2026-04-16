package com.example.unscramble.data

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import kotlinx.coroutines.flow.Flow

@Dao
interface WordDao {

    @Insert
    suspend fun insert(word: WordEntity)

    @Query("SELECT * FROM words")
    fun getAllWords(): Flow<List<WordEntity>>
}