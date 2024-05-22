package chap10.section1

fun main() {
    data class User(val name: String, var skills: String, var email: String? = null)
    val user = User("Kildong", "default")

    val result = with(user) {
        skills = "Kotlin"
        email = "kildong@example.com"
    }
    println(user)
    println("result: $result")

    val result2 = with(user) {
        skills = "Java"
        "Success" // 마지막 표현식 반환
    }
    println(user)
    println("result: $result2")
}