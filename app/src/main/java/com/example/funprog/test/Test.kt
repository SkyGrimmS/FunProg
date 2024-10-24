package com.example.funprog.test

import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.Json
import java.io.File

fun main() {
    val file = File("items.json")
//    writeToFile(file)
    val items = readFromFile(file)
    for (item in items){
        println(item)
    }
}

fun readFromFile(file: File):List<Item>{
    val content = file.readText().trim()
    return Json.decodeFromString<List<Item>>(content)

}

fun writeToFile(file: File){
    val items = mutableListOf<Item>()

    while (true){
        println("Enter ID or 0 to exit")
        val id = readln().toInt()
        if (id == 0) break

        println("Enter name")
        val name = readln()

        val item = Item(id,name)
        items.add(item)
    }

        val itemAsString = Json.encodeToString(items)
        file.writeText(itemAsString)

}