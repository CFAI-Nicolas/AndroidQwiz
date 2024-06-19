package com.example.lheureduqwizzz

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.content.Intent
import android.widget.Button
import android.widget.TextView

class GameOverActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game_over)

        val finalScore = intent.getIntExtra("FINAL_SCORE", 0)
        val playerName = intent.getStringExtra("PLAYER_NAME")

        val tvFinalScore = findViewById<TextView>(R.id.tvFinalScore)
        tvFinalScore.text = "Score final : $finalScore\nPlayer: $playerName"

        findViewById<Button>(R.id.btnReturnToMenu).setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP or Intent.FLAG_ACTIVITY_NEW_TASK)
            startActivity(intent)
            finish()
        }
    }
}