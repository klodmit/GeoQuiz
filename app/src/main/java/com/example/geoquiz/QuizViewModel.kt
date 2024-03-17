package com.example.geoquiz

import android.util.Log
import androidx.lifecycle.ViewModel


class QuizViewModel : ViewModel() {
    var currentIndex = 0
    var isCheater = false
    private val questionBank = listOf(
        Question(R.string.question_australia, true),
        Question(R.string.question_oceans, true),
        Question(R.string.question_mideast, true),
        Question(R.string.question_africa, true),
        Question(R.string.question_america, true),
        Question(R.string.question_asia, true),
    )

    val currentQuestionAnswer: Boolean get() = questionBank[currentIndex].answer
    val currentQuestionText: Int get() = questionBank[currentIndex].textResId

    fun moveToNext() {
        currentIndex = (currentIndex + 1) % questionBank.size
    }
}