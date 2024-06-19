package com.example.lheureduqwizzz.data

class QuestionRepository(private val questionDao: QuestionDao) {

    suspend fun insert(question: Question) {
        questionDao.insert(question)
    }

    suspend fun getAllQuestions(): List<Question> {
        return questionDao.getAllQuestions()
    }

    suspend fun getRandomQuestions(): List<Question> {
        return questionDao.getRandomQuestions()
    }
}
