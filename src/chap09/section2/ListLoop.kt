package chap09.section2

fun main() {
    val fruits = listOf("apple", "banana", "kiwi")
    for (item in fruits) {
        println(item)
    }

    for (index in fruits.indices) { // 인덱스 지정
        println("fruits[$index] = ${fruits[index]}")
//        if (index % 2 == 0) println("fruits[$index] = ${fruits[index]}") // 짝수만 고르기
    }
    println("fruits size = ${fruits.size}")
    var index = 0
    while (index < fruits.size) {
        println("fruits[$index] = ${fruits[index]}")
        index++
    }

//    val emptyList: List<String> = emptyList<String>() // 비어있는 리스트 생성, 이때는 반드시 형식매개변수를 지정

    val nonNullsList: List<Int> = listOfNotNull(2, 45, 2, null, 5, null)
    println(nonNullsList)
}