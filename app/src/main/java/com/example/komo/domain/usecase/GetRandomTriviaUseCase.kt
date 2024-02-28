package com.example.komo.domain.usecase

import com.example.komo.data.repository.NumbersRepository

class GetRandomTriviaUseCase(private val numbersRepository: NumbersRepository) {
    suspend operator fun invoke() = numbersRepository.getRandomTrivia()
}
