package com.example.funprog.extentions

 fun <R,T> Collection<T>.transform(operation: (T) -> R): List<R> {
        val result = mutableListOf<R>()

        for (profile in this) {
            result.add(operation(profile))
        }
        return result
    }

fun <T> Collection<T>.filter(isSuitable:(T) -> Boolean):List<T>{
    val result = mutableListOf<T>()
    for (item in this){
        if (isSuitable(item)){
            result.add(item)
        }
    }
    return result
}
