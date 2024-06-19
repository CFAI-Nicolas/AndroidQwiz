package com.example.lheureduqwizzz

import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.os.CountDownTimer
import android.os.Handler
import android.os.Looper
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import com.example.lheureduqwizzz.data.Question
import com.example.lheureduqwizzz.data.QuizDatabase
import kotlinx.coroutines.launch

class QuizActivity : AppCompatActivity() {

    private lateinit var tvQuestion: TextView
    private lateinit var tvQuestionCount: TextView
    private lateinit var tvTimer: TextView
    private lateinit var rgOptions: RadioGroup
    private lateinit var rbOption1: RadioButton
    private lateinit var rbOption2: RadioButton
    private lateinit var rbOption3: RadioButton
    private lateinit var rbOption4: RadioButton

    private lateinit var questionList: MutableList<Question>
    private var currentQuestion: Question? = null
    private var questionCount: Int = 0
    private var score: Int = 0

    private lateinit var countDownTimer: CountDownTimer
    private val timerDuration: Long = 30000 // 30 seconds

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz)

        tvQuestion = findViewById(R.id.tvQuestion)
        tvQuestionCount = findViewById(R.id.tvQuestionCount)
        tvTimer = findViewById(R.id.tvTimer)
        rgOptions = findViewById(R.id.rgOptions)
        rbOption1 = findViewById(R.id.rbOption1)
        rbOption2 = findViewById(R.id.rbOption2)
        rbOption3 = findViewById(R.id.rbOption3)
        rbOption4 = findViewById(R.id.rbOption4)

        val playerName = intent.getStringExtra("PLAYER_NAME")
        title = "Player: $playerName"

        loadQuestions()

        rbOption1.setOnClickListener { validateAnswer(1, rbOption1) }
        rbOption2.setOnClickListener { validateAnswer(2, rbOption2) }
        rbOption3.setOnClickListener { validateAnswer(3, rbOption3) }
        rbOption4.setOnClickListener { validateAnswer(4, rbOption4) }
    }

    private fun loadQuestions() {
        val database = QuizDatabase.getDatabase(this)
        val questionDao = database.questionDao()

        lifecycleScope.launch {
            questionList = questionDao.getRandomQuestions().toMutableList()
            showNextQuestion()
        }
    }

    private fun showNextQuestion() {
        if (questionList.isNotEmpty()) {
            currentQuestion = questionList.removeAt(0)
            currentQuestion?.let { question ->
                tvQuestion.text = question.question
                rbOption1.text = question.option1
                rbOption2.text = question.option2
                rbOption3.text = question.option3
                rbOption4.text = question.option4

                questionCount++
                val questionCountText = "Tu es a la question $questionCount"
                tvQuestionCount.text = questionCountText

                rgOptions.clearCheck()
                resetOptionColors()

                startTimer()
            }
        } else {
            loadQuestions()
        }
    }

    private fun startTimer() {
        countDownTimer = object : CountDownTimer(timerDuration, 1000) {
            override fun onTick(millisUntilFinished: Long) {
                val secondsLeft = millisUntilFinished / 1000
                tvTimer.text = secondsLeft.toString()
            }

            override fun onFinish() {
                tvTimer.text = "0"
                onTimeUp()
            }
        }.start()
    }

    private fun onTimeUp() {
        Toast.makeText(this, "Time's up!", Toast.LENGTH_SHORT).show()
        navigateToGameOver()
    }

    private fun validateAnswer(answerNr: Int, selectedOption: RadioButton) {
        countDownTimer.cancel()

        currentQuestion?.let { question ->
            if (answerNr == question.answerNr) {
                score++
                selectedOption.setTextColor(Color.GREEN)
            } else {
                selectedOption.setTextColor(Color.RED)
                navigateToGameOver()
                return
            }
        }

        Handler(Looper.getMainLooper()).postDelayed({
            showNextQuestion()
        }, 2000)
    }

    private fun resetOptionColors() {
        rbOption1.setTextColor(Color.BLACK)
        rbOption2.setTextColor(Color.BLACK)
        rbOption3.setTextColor(Color.BLACK)
        rbOption4.setTextColor(Color.BLACK)
    }

    private fun navigateToGameOver() {
        val intent = Intent(this, GameOverActivity::class.java)
        intent.putExtra("FINAL_SCORE", score)
        intent.putExtra("PLAYER_NAME", title)
        startActivity(intent)
        finish()
    }
}
