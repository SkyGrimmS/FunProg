package com.example.funprog.product_cards
object ConditionProductCategoryIsHomeDecor: Condition {
    override fun isSuitable(card: ProductCard): Boolean {
        return card.productCategory == ProductCategories.HOME_DECOR
    }
}