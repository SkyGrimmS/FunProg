package com.example.funprog.test

var age:Int? = 12
fun main() {
    val result = age?.let {
        if (it >= 18){
            "You are an adult"
        }else{
            "You will be an adult in ${18- it}"
        }
    }
    result?.let {
        println(result)
    }
}

