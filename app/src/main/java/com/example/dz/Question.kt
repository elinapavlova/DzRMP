package com.example.dz

import androidx.annotation.StringRes

data class Question (@StringRes val QuestionResId: Int,
                     val correctAnswer: Boolean,
                     var answered: Boolean = false,
                     var correct: Boolean = false) {

    fun answeredCorrectly() {
        answered = true
        correct = true
    }

    fun answeredIncorrectly() {
        answered = true
        correct = false
    }
}
