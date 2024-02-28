package com.example.komo.di

import com.example.komo.data.api.RestApi
import org.koin.dsl.module
import retrofit2.Retrofit

val restApiModule = module {
    single(createdAtStart = true) {
        get<Retrofit>().create(RestApi::class.java)
    }
}
