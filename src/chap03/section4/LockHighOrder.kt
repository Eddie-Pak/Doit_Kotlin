package chap03.section4

import java.util.concurrent.locks.ReentrantLock

var sharable = 1 // 보호가 필요한 공유자원

fun main() {
    val reLock = ReentrantLock()

    lock(reLock, { criticalFunc() })
    lock(reLock) { criticalFunc() }
    lock(reLock, ::criticalFunc)
    // 위의 표현식 3개는 모두 동일

    println(sharable)
}
fun criticalFunc() {
    sharable += 1
}

fun <T> lock(reLock: ReentrantLock, body: () -> T): T {
    reLock.lock()
    try {
        return body()
    } finally {
        reLock.unlock()
    }
}