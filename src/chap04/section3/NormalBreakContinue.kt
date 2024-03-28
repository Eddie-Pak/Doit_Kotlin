package chap04.section3

fun main() {
    for (i in 1..5) {
        if (i == 3) break // continue를 넣으면?
        print(i)
    }
    println()
    println("outside")
    println()
    labelBreak()
}

//fun labelBreak() {
//    println("labelBreak")
//    for (i in 1..5) {
//        second@for (j in 1..5){
//            if (j == 3) break
//            println("i:$i, j: $j")
//        }
//        println("after for j")
//    }
//    println("after for i")
//}

fun labelBreak() {
    println("labelBreak")
    first@for (i in 1..5) {
        second@for (j in 1..5){
            if (j == 3) break@first // continue로 바꿔서도 실행해보가
            println("i:$i, j: $j")
        }
        println("after for j")
    }
    println("after for i")
}