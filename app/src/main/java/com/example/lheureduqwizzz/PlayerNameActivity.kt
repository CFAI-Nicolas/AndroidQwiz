package com.example.lheureduqwizzz

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class PlayerNameActivity : AppCompatActivity() {

    private lateinit var etPlayerName: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_player_name)

        etPlayerName = findViewById(R.id.etPlayerName)

        findViewById<Button>(R.id.btnSubmitName).setOnClickListener {
            val playerName = etPlayerName.text.toString()
            if (playerName.isEmpty()) {
                Toast.makeText(this@PlayerNameActivity, "Veuillez entrer un pseudo", Toast.LENGTH_SHORT).show()
            } else {
                val intent = Intent(this@PlayerNameActivity, QuizActivity::class.java)
                intent.putExtra("PLAYER_NAME", playerName)
                startActivity(intent)
            }
        }
    }
}
