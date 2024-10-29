package com.example.funprog.product_cards

object ConditionRateMore4:Condition {
    override fun isSuitable(card: ProductCard): Boolean {
        return card.productRating >= 4.0
    }
}