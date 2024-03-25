package chap04.section3.noinline

fun main() {
    retFunc()
}

fun inlineLambda(a: Int, b: Int, out: (Int, Int) -> Unit) { // inline 제거
    out(a, b)
}

fun retFunc() {
    println("start of retFunc")
    inlineLambda(13, 3) {a, b -> // 람다식 블록의 시작 부분에 라벨을 지정 암묵적 라벨로 바꿔놓음 inlineLambda(13, 3) lit@{a, b ->
        val result = a + b
        if(result > 10) return@inlineLambda // 라벨을 사용한 블록의 끝부분으로 반환 if(result > 10) return@lit
        println("result: $result")
    } // 이 부분으로 빠져나감

    println("end of retFunc") // 이 부분이 실행됨
}