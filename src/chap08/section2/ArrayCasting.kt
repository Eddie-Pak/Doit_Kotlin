package chap08.section2

fun main() {
    val b = Array<Any>(10, {0})
    val arr = Array(10, {i -> i * 2})

    b[0] = "Hello World"
    b[1] = 1.1
    println(b[0])
    println(b[1])
    println(b[2])

    // forEach()에 의한 요소 순환
    arr.forEach { element -> print("$element ") }
    println()
    // forEachIndexed()에 의한 요소 순환
    arr.forEachIndexed { i, e -> println("arr[$i] = $e") }

    // iterator()를 사용한 요소 순환
    val iter: Iterator<Int> = arr.iterator()
    while (iter.hasNext()) {
        val e = iter.next()
        print("$e ")
    }
}