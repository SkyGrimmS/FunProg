package com.example.funprog.profile

object ConditionMale:Condition {
    override fun isSuitable(person: Person): Boolean {
        return person.gender == Gender.MALE
    }
}