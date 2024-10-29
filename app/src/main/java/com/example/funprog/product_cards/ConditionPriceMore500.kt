package com.example.funprog.product_cards

object ConditionPriceMore500:Condition {
    override fun isSuitable(card: ProductCard): Boolean {
        return card.productPrise >= 500
    }
}