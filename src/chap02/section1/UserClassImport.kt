package chap02.section1

import com.example.edu.Person as User

fun main() {
    val user1 = User("kidong", 30)
    val user2 = Person("A123", "Kildong")

    println(user1.name)
    println(user1.age)

    println(user2.id)
    println(user2.name)

    println(user1)
    println(user2)
}

class Person(val id: String, val name: String)