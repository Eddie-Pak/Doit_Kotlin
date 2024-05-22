package chap10.section1

fun main() {
    var skills = "Kotlin"
    println(skills)

    val a = 10
    skills = run {
        val level = "Kotlin Level: " + a
        level // 마지막 표현식이 반환됨
    }
    println(skills)
}