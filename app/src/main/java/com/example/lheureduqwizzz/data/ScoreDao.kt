package com.example.lheureduqwizzz.data

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

@Dao
interface ScoreDao {

    @Insert
    suspend fun insert(score: Score)

    @Query("SELECT * FROM scores ORDER BY score DESC")
    suspend fun getAllScores(): List<Score>
}
