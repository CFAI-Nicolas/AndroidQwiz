package com.example.lheureduqwizzz.data

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

@Dao
interface QuestionDao {

    @Insert
    suspend fun insert(question: Question)

    @Query("SELECT * FROM quiz_questions")
    suspend fun getAllQuestions(): List<Question>

    @Query("SELECT * FROM quiz_questions ORDER BY RANDOM()")
    suspend fun getRandomQuestions(): List<Question>
}
