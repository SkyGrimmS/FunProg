package com.example.funprog.product_cards

import com.example.funprog.extentions.transform


fun main() {
    CardsRepository.card.also {
        println("Sort by Clothing")
    }
        .filter { it.productCategory == ProductCategories.CLOTHING }.also {
            println("Transform to string")
        }
        .transform { "${it.id} - ${it.productName} - ${it.productPrise * 2}" }.also {
            println("Print to each")
        }
        .forEach{ println(it)}
}
