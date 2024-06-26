package chap11.section4

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import java.util.concurrent.atomic.AtomicInteger
import kotlin.system.measureTimeMillis

//var counter = 0 // 병행 처리 중 문제가 발생할 수 있는 변수
var counter = AtomicInteger(0) // 원자변수로 초기화

suspend fun massiveRun(action: suspend () -> Unit) {
    val n = 1000 // 실행할 코루틴의 수
    val k = 1000 // 각 코루틴을 반복할 수
    val time = measureTimeMillis {
        val jobs = List(n) {
            GlobalScope.launch {
                repeat(k) {action()}
            }
        }
        jobs.forEach {it.join()}
    }
    println("Completed ${n * k} actions in $time ms")
}

fun main() = runBlocking{
    massiveRun {
//        counter++ // 증가연산에서 값에서 무결성 문제가 발생할 수 있음
        counter.incrementAndGet() // 원자 변수의 멤버 메서드를 사용해 증가
    }
//    println("Counter = $counter")
    println("Counter = ${counter.get()}") // 값 읽기
}