package chap11.section3

import kotlinx.coroutines.*

fun main() = runBlocking{
    // cancel() 사용
//    val job = launch {
//        repeat(1000) { i ->
//            println("let's go to $i ")
//        }
//    }
//    delay(1300L)
//    job.cancel()

    // finally 실행보장
//    val job = launch {
//        try {
//            repeat(1000) { i ->
//                println("I'm sleeping $i ...")
//                delay(500L)
//            }
//        } finally {
//            println("Bye!")
//        }
//    }
//    delay(1300L)
//    job.cancelAndJoin() // 작업을 취소하고 완료될 때까지 기다림
//    println("main: Quit!")

    // NonCancellable문맥 사용
    val job = launch {
        try {
            repeat(1000) { i ->
                println("I'm sleeping $i ...")
                delay(500L)
            }
        } finally {
            withContext(NonCancellable) { // finally의 완전한 실행을 보장함
                println("I'm running finally")
                delay(1000L)
                println("Non-Cancellable") // 1초를 지연해도 취소되지 않음
            }
        }
    }
    delay(1300L)
    job.cancelAndJoin() // 작업을 취소하고 완료될 때까지 기다림
    println("main: Quit!")
}