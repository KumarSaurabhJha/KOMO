package com.example.komo.data.repository

import com.example.komo.data.api.RestApi
import com.example.komo.data.model.NumberResponse
import com.example.komo.domain.NumberDomainModel

class NumbersRepository(private val restApi: RestApi) {

    suspend fun getRandomTrivia() = processNumberRestResponse(restApi.getRandomTrivia())


    private fun processNumberRestResponse(response: NumberResponse): NumberDomainModel {
        return NumberDomainModel(
            text = response.text,
            number = response.number,
            found = response.found
        )
    }
}
