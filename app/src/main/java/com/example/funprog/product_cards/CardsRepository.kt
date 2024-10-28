package com.example.funprog.product_cards

import kotlinx.serialization.json.Json
import java.io.File

object CardsRepository {

    private val file = File("cards.json")

    private val _cards = loadCards()
    val card
        get() = _cards.toList()

    private fun loadCards():List<ProductCard>{
        val content = file.readText().trim()
        return Json.decodeFromString(content)
    }


}