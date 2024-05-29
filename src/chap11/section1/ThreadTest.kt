package chap11.section1

// Thread 클래스를 상속받아 구현하기
class SimpleThread: Thread() {
    override fun run() {
        println("Current Threads: ${Thread.currentThread()}")
    }
}

// Runnable 인터페이스로부터 run() 메서드 구현하기
class SimpleRunnable: Runnable {
    override fun run() {
        println("Current Threads: ${Thread.currentThread()}")
    }
}

fun main() {
    val thread =SimpleThread()
    thread.start()

    val runnable = SimpleRunnable()
    val thread1 = Thread(runnable)
    thread1.start()

//    // 코틀린의 객체 표현식에 의해 익명 클래스로 생성하고 run() 메서드를 오버라이딩해서 구현, start()메서드를 통해 스레드를 실행
//    object : Thread() {
//        override fun run() {
//            println("Current Threads: ${Thread.currentThread()}")
//        }
//    }.start()

//    // Runnable을 전달하는 람다식
//    Thread({
//        println("Current Threads(lambda): ${Thread.currentThread()}")
//    }).start()
}