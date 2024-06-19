package com.example.lheureduqwizzz

import android.app.Application
import com.example.lheureduqwizzz.data.Question
import com.example.lheureduqwizzz.data.QuizDatabase
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class QuizApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        val database = QuizDatabase.getDatabase(this)
        val questionDao = database.questionDao()

        CoroutineScope(Dispatchers.IO).launch {
            // Ajouter des questions initiales ici
            questionDao.insert(Question(question = "Question 1?", option1 = "Option 1", option2 = "Option 2", option3 = "Option 3", option4 = "Option 4", answerNr = 1))
            questionDao.insert(Question(question = "Question 2?", option1 = "Option 1", option2 = "Option 2", option3 = "Option 3", option4 = "Option 4", answerNr = 2))
            questionDao.insert(Question(question = "Question 3?", option1 = "Option A", option2 = "Option B", option3 = "Option C", option4 = "Option D", answerNr = 3))
            // Ajoutez plus de questions ici selon vos besoins
        }
    }
}
