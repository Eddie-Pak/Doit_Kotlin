package chap02.section3

fun main() {
    var test: Number = 12.2 // test는 Float형으로 스마트캐스트
    println("$test")

    test = 12
    println("$test") // Int형으로 스마트캐스트

    test = 120L
    println("$test") // Long형으로 스마트캐스트

    test += 12.0f // Float형으로 스마트 캐스트
    println("$test")

}