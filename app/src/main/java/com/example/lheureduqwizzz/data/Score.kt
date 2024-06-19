package com.example.lheureduqwizzz.data

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "scores")
data class Score(
    val playerName: String,
    val score: Int,
    @PrimaryKey(autoGenerate = true) val id: Int = 0
)
