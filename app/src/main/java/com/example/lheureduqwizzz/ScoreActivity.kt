package com.example.lheureduqwizzz

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import com.example.lheureduqwizzz.data.QuizDatabase
import com.example.lheureduqwizzz.data.Score
import kotlinx.coroutines.launch

class ScoreActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_score)

        val lvScores = findViewById<ListView>(R.id.lvScores)

        val database = QuizDatabase.getDatabase(this)
        val scoreDao = database.scoreDao()

        lifecycleScope.launch {
            val scores = scoreDao.getAllScores()
            val scoreStrings = scores.map { "${it.playerName}: ${it.score}" }
            val adapter = ArrayAdapter(this@ScoreActivity, android.R.layout.simple_list_item_1, scoreStrings)
            lvScores.adapter = adapter
        }
    }
}
