package com.example.komo.di

import com.example.komo.presentation.viewmodel.NumbersViewModel
import org.koin.androidx.viewmodel.dsl.viewModelOf
import org.koin.dsl.module

val viewModelModule = module {
    viewModelOf(::NumbersViewModel)
}
