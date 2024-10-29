package com.example.funprog.product_cards

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class ProductCard(
    @SerialName("product_name") val productName:String,
    @SerialName("product_price") val productPrise:Float,
    @SerialName("product_category") val productCategory: ProductCategories,
    @SerialName("product_brand") val productBrand:String,
    @SerialName("product_rating") val productRating:Float,
    @SerialName("product_availability") val productStock:Boolean,
    @SerialName("product_color") val color:String,
    @SerialName("id") val id:Int

) {
}