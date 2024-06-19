package com.example.lheureduqwizzz

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.content.Intent
import android.view.View

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<View>(R.id.btnStartQuiz).setOnClickListener {
            startActivity(Intent(this@MainActivity, PlayerNameActivity::class.java))
        }

        findViewById<View>(R.id.btnViewScores).setOnClickListener {
            startActivity(Intent(this@MainActivity, ScoreActivity::class.java))
        }
    }
}