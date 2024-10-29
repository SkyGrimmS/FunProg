package com.example.funprog.product_cards


fun main() {
    val cards = CardsRepository.card

    var filtered = filter(cards, object :Condition{
        override fun isSuitable(card: ProductCard): Boolean {
            return card.productPrise >= 500
        }
    })

    filtered = filter(filtered, object :Condition{
        override fun isSuitable(card: ProductCard): Boolean {
            return card.productCategory == ProductCategories.HOME_DECOR
        }
    })

    filtered = filter(filtered, object :Condition{
        override fun isSuitable(card: ProductCard): Boolean {
            return card.productRating >= 4.0
    }
    })

    for (card in filtered){
        println(card)
    }
}
fun filter(cards:List<ProductCard>, condition: Condition):List<ProductCard>{
    val result = mutableListOf<ProductCard>()

    for (card in cards){
        if (condition.isSuitable(card)){
            result.add(card)
        }
    }
    return result
}