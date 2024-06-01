package chap11.section3

import kotlinx.coroutines.TimeoutCancellationException
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.withTimeout

fun main() = runBlocking {
//    val startTime = System.currentTimeMillis()
//    val job = GlobalScope.launch {
//        var nextPrintTime = startTime
//        var i = 0
//        while (i < 5) { // 조건을 계산에 의해 반복 // while (isActive) 로 변경하면 의도한 시간에 루프가 취소되어 중단됨
//            if (System.currentTimeMillis() >= nextPrintTime) {
//                println("I'm sleeping ${i++} ...")
//                nextPrintTime += 500L
//            }
//        }
//    }
//    delay(1300L)
//    println("main: I'm tired of waiting!")
//    job.cancelAndJoin()
//    println("main: Now I can quit.")

    // 일정 실행 시간뒤에 코루틴을 취소할 수 있는 핵심함수인 withTimeout()의 활용
    // 시간이 만료되면 block을 취소시키고 오류가 발생하는 코드 예외를 발생하지 않고 null로 처리하려면  withTimeoutOrNull() 사용
    try {
        withTimeout(1300L) { // Timeout 예외 발생, null로 처리하는 경우 withTimeoutOrNull()을 사용
            repeat(1000) { i ->
                println("I'm sleeping $i ...")
                delay(500L)
            }
        }
    } catch (e: TimeoutCancellationException) {
        println("timed out with $e")
    }
}