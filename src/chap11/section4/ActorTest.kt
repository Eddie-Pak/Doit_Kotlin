package chap11.section4

import kotlinx.coroutines.*
import kotlinx.coroutines.channels.actor
import kotlin.system.measureTimeMillis

suspend fun CoroutineScope.massiveRun(action: suspend () -> Unit) {
    val n = 1000
    val k = 1000
    val time = measureTimeMillis {
        val jobs = List(n) {
            launch {
                repeat(k) { action() }
            }
        }
        jobs.forEach { it.join() }
    }
    println("Completed ${n * k} action in $time ms")
}

// counterActor를 위한 메세지
sealed class CounterMsg
object IncCounter : CounterMsg() // counter를 증가하기 위한 단방향 메세지
class GetCounter(val response: CompletableDeferred<Int>) : CounterMsg() // 응답 요청

// 새로운 counter actor를 위한 함수
fun CoroutineScope.counterActor() = actor<CounterMsg> {
    var counter = 0 // 카운터
    for (msg in channel) { // 들어오는 메세지에 대한 처리 반복문
        when (msg) {
            is IncCounter -> counter++
            is GetCounter -> msg.response.complete(counter)
        }
    }
}

fun main() = runBlocking<Unit>{
    val counter = counterActor() // actor의 생성
    GlobalScope.massiveRun {
        counter.send(IncCounter)
    }
    // actor의 카운터값을 얻기 위해 요철
    val response = CompletableDeferred<Int>()
    counter.send(GetCounter(response))
    println("Counter = ${response.await()}")
    counter.close() // actor의 중단
}