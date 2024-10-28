package com.example.funprog.test

import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.Json
import java.io.File

fun main() {

    val booksFile = File("Books.json")
    writeBookToFile(booksFile)

    val books = readBookFromFile(booksFile)
    for (book in books){
        println(book)
    }
}



fun readBookFromFile(booksFile: File):List<Book>{
    val content = booksFile.readText().trim()
    return Json.decodeFromString<List<Book>>(content)
}
fun writeBookToFile(booksFile: File) {
    val books = mutableListOf<Book>()

    while (true) {
        print("Enter book name or 0 to exit: ")
        val name = readln().toString()
        if (name == "0") break

        print("Enter author name: ")
        val authorName = readln().toString()

        print("Enter post year: ")
        val postYear = readln().toInt()

        val book = Book(name, authorName, postYear)
        books.add(book)
    }
    val bookToString = Json.encodeToString(books)
    booksFile.writeText(bookToString)
}





