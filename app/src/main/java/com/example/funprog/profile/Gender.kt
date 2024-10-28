package com.example.funprog.profile

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
enum class Gender (val title:String){
    @SerialName("Male") MALE(title = "Male"),
    @SerialName("Female") FEMALE(title = "Female")
}