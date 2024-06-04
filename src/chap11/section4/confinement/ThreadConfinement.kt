package chap11.section4.confinement

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.newSingleThreadContext
import kotlinx.coroutines.runBlocking
import kotlin.coroutines.CoroutineContext
import kotlin.system.measureTimeMillis

// 단일 스레드 문맥을 선언
val counterContext = newSingleThreadContext("CounterContext")
var counter = 0

suspend fun massiveRun(context: CoroutineContext, action: suspend () -> Unit) {
    val n = 1000
    val k = 1000
    val time = measureTimeMillis {
        val jobs = List(n) {
            GlobalScope.launch(context) {
                repeat(k) { action() }
            }
        }
        jobs.forEach { it.join() }
    }
    println("Completed ${n * k} actions in $time ms")
}

//fun main() = runBlocking<Unit> {
//    massiveRun {
//        withContext(counterContext) { // 단일 스레드에 가둠 시간이 많이 걸림
//            counter++
//        }
//    }
//    println("Counter = $counter")
//}
fun main() = runBlocking<Unit> {
    massiveRun(coroutineContext) { // massiveRun()에 스레드 가두기를 직접 적용하면 시간 절약
            counter++
    }
    println("Counter = $counter")
}