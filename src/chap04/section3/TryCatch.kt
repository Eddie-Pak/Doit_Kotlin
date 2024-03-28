package chap04.section3

fun main() {
    val a = 6
    val b = 0
    val c: Int

    try {
        c = a/b // 0으로 나눔
    } catch (e: Exception){
        println("Exception is handled")
    } finally {
        println("finally 블록은 반드시 항상 실행됨")
    }
}

// 산술 연산에 대한 예외를 따로 특정해서 잡아보는 코드
//try {
//    c = a/b
//} catch (e: ArithmeticException){
//    println("Exception is handled. ${e.message}")
//} finally {
//    println("finally 블록은 반드시 항상 실행됨")
//}
//
// 임시메모리 영역인 스택을 추적할수있는 코드
//try {
//    c = a/b
//} catch (e: Exception){
//    e.printStackTrace()
//} finally {
//    println("finally 블록은 반드시 항상 실행됨")
//}