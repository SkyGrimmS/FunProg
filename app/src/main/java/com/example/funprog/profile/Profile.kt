package com.example.funprog.profile

fun main() {
    val profiles = ProfilesRepository.profile

    var filter = filter(profiles, object:Condition{
        override fun isSuitable(person: Person): Boolean {
            return person.age >= 25
        }
    })

    filter = filter(filter, object :Condition{
        override fun isSuitable(person: Person): Boolean {
            return person.gender == Gender.MALE
        }
    })

    filter = filter(filter, object :Condition{
        override fun isSuitable(person: Person): Boolean {
            return person.firstName.startsWith("A")
        }
    })

    filter = filter(filter, object :Condition{
        override fun isSuitable(person: Person): Boolean {
            return person.age <= 36
        }
    })

    for (person in filter){
        println(person)
    }
}


fun filter(profiles: List<Person>, condition: Condition): List<Person>{
    val result = mutableListOf<Person>()
    for (person in profiles){
        if (condition.isSuitable(person)){
            result.add(person)
        }
    }
    return result
}


//fun filter(profiles: List<Person>, condition: Condition): List<Person>{
//    val result = mutableListOf<Person>()
//    for (person in profiles){
//        if (condition.isSuitable(person)){
//            result.add(person)
//        }
//    }
//    return result
//}
