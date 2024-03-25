package chap04.section3

fun main() {
    for (i in 1..5) {
        if (i == 3) break // continue를 넣으면?
        print(i)
    }
    println()
    println("outside")
}