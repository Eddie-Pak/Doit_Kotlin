package chap11.section2

val fibonacciSeq = sequence {
    var a = 0
    var b = 1
    yield(1) // 지연함수가 사용됨

    while (true) {
        yield(a + b)
        val tmp = a + b
        a = b
        b = tmp
    }
}

val seq = sequence {
    val start = 0

    yield(start) // 단윌 값 산출
    yieldAll(1..5 step 2) // 반복 값 산출
    yieldAll(generateSequence(8) {it * 3}) // 무한한 시퀀스에서 산출
}

fun main() {
    println(fibonacciSeq.take(8).toList()) // 8개의 값을 획득

    println(seq.take(7).toList())

    // 다음요소에 대한 지정
    val saved = fibonacciSeq.iterator()
    println("${saved.next()}, ${saved.next()}, ${saved.next()}")
}