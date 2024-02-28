package com.example.komo.data.model

data class NumberResponse(
    val text: String,
    val number: Int,
    val found: Boolean,
    val type: String,
    val date: String?,
    val year: String?
)
