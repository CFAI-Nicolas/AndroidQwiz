package com.example.lheureduqwizzz.data

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "quiz_questions")
data class Question(
    @PrimaryKey(autoGenerate = true) val id: Int = 0,
    val question: String,
    val option1: String,
    val option2: String,
    val option3: String,
    val option4: String,
    val answerNr: Int
)
