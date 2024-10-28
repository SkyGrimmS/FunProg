package com.example.funprog.profile

import kotlinx.serialization.json.Json
import java.io.File

object ProfilesRepository {
    private val file = File("profiles.json")

    private val _profiles = loadProfiles()
     val profile
         get() = _profiles.toList()






    private fun loadProfiles():List<Person>{
        val content = file.readText().trim()
        return Json.decodeFromString(content)
    }
}