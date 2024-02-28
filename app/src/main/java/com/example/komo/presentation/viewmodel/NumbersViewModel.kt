package com.example.komo.presentation.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.komo.domain.usecase.GetRandomTriviaUseCase
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch

class NumbersViewModel(
    private val getRandomTriviaUseCase: GetRandomTriviaUseCase,
) : ViewModel() {


    init {
        viewModelScope.launch {
            numberInformation = getRandomTriviaUseCase().text
        }
    }

    private var numberInformation = ""
        set(value) {
            field = value
            updateState()
        }


    private val state
        get() = NumberState(
            numberInformation = numberInformation,
        )

    private val _numbersUIState = MutableStateFlow(state)
    val numbersState = _numbersUIState.asStateFlow()

    private fun updateState() {
        _numbersUIState.update { state }
    }
}

data class NumberState(
    val numberInformation: String,
)

