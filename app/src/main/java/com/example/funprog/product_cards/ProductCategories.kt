package com.example.funprog.product_cards

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
enum class ProductCategories (val title:String){
    @SerialName("Electronics") ELECTRONICS(title = "Electronics"),
    @SerialName("Clothing") CLOTHING(title = "Clothing"),
    @SerialName("Home Decor") HOME_DECOR(title = "Home Decor"),
    @SerialName("Beauty") BEAUTY(title = "Beauty"),
    @SerialName("Sports") SPORTS(title = "Sports")
}