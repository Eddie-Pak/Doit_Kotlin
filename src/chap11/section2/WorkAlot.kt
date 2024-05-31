package chap11.section2

import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() = runBlocking { // 많은 양의 코루틴을 위한 List
    val jobs = List(100_000) {
        launch {
            delay(1000L)
            print(".")
        }
    }
    jobs.forEach { it.join() } // 모든 jobs가 완료될 때까지 기다림

    // repeat()를 사용해 많은 양의 코루틴을 생성할 수 있다.
    repeat(100_000) {
        launch {
            delay(1000L)
            print("#")
        }
    }
}