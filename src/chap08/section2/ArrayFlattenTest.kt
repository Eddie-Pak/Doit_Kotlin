package chap08.section2

fun main() {
    val numbers = arrayOf(1, 2 ,3)
    val strs = arrayOf("one", "two", "three")
    val simpleArray = arrayOf(numbers, strs) // 2차원 배열
    simpleArray.forEach { println(it) }
    println()

    println(simpleArray[1].joinToString()) // joinToString()으로 요소 출력하기
    println(simpleArray[1].toString())
    println()

    val flattenSimpleArray = simpleArray.flatten() // 단일배열로 변환하기
    println(flattenSimpleArray)
    println()

    println(simpleArray.joinToString())
    println(simpleArray.joinToString(separator = ", ") { it.joinToString() })

}