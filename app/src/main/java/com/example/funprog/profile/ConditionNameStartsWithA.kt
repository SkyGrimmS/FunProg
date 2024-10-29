package com.example.funprog.profile

object ConditionNameStartsWithA:Condition{
    override fun isSuitable(person: Person): Boolean {
        return person.firstName.startsWith("A")
    }
}