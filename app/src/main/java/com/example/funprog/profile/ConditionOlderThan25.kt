package com.example.funprog.profile

object ConditionOlderThan25:Condition {
    override fun isSuitable(person: Person): Boolean {
        return person.age > 25
    }
}