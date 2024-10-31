package com.example.funprog.profile

fun main() {
    showEmail()
}


fun filterCollections(){
    ProfilesRepository.profile
        .filter { it.age >= 25 }
        .filter { it.gender == Gender.MALE }
        .filter { it.firstName.startsWith("A") }
        .filter { it.age <= 36 }
        .map { it.copy(age = it.age + 1 ) }
        .forEach{it.age}
}
fun showEmail(){
    println("Enter ID")
    val id = readln().toInt()
    ProfilesRepository.profile.find { it.id == id }?.let { println(it.email)}?: println("not found")
}