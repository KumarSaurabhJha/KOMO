package com.example.komo.data.api

import com.example.komo.data.model.NumberResponse
import retrofit2.http.GET

interface RestApi {
    @GET("random/trivia?json")
    suspend fun getRandomTrivia(): NumberResponse
}
