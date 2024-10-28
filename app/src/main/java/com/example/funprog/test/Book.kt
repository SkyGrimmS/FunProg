package com.example.funprog.test

import kotlinx.serialization.Serializable


@Serializable
data class Book(
    val name:String,
    val authorName:String,
    val postYear: Int
) {
}