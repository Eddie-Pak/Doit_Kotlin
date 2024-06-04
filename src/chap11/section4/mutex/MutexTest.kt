package chap11.section4.mutex

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.sync.Mutex
import kotlinx.coroutines.sync.withLock
import kotlin.system.measureTimeMillis

val mutex = Mutex()
var counter = 0

suspend fun massiveRun(action: suspend () -> Unit) {
    val n = 1000
    val k = 1000
    val time = measureTimeMillis {
        val jobs = List(n) {
            GlobalScope.launch {
                repeat(k) { action() }
            }
        }
        jobs.forEach { it.join() }
    }
    println("Completed ${n * k} actions in $time ms")
}

fun main() = runBlocking<Unit>{
    massiveRun {
        mutex.withLock { // 상호배제를 사용한 보호
            counter++ // 임계 구역 코드
        }
    }
    println("Counter = $counter")
}