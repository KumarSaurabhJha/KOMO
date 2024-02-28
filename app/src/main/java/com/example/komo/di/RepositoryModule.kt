package com.example.komo.di

import com.example.komo.data.repository.NumbersRepository
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.module

val repositoryModule = module {
    singleOf(::NumbersRepository)
}
