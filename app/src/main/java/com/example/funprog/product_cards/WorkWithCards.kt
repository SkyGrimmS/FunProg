package com.example.funprog.product_cards

import com.example.funprog.profile.ProfilesRepository

fun main() {
    val cards = CardsRepository.card
    for (card in cards){
        println(card)
    }
}