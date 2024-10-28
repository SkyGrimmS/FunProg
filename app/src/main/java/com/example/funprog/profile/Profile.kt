package com.example.funprog.profile

import kotlinx.serialization.json.Json
import java.io.File

fun main() {
    val profiles = ProfilesRepository.profile
    for (person in profiles){
        println(person)
    }
}
