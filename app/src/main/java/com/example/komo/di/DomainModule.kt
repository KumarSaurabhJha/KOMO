package com.example.komo.di

import com.example.komo.domain.usecase.GetRandomTriviaUseCase
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.module

val domainModule = module {
    singleOf(::GetRandomTriviaUseCase)
}
