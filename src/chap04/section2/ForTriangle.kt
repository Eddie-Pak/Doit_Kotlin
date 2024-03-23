package chap04.section2

fun main() {
    print("Enter the lines: ")
    val n = readLine()!!.toInt() // 콘솔로 입력받아 인트로 넘기는건가??

    for (line in 1..n) {
        for (space in 1..(n - line)) print(" ") // 공백
        for (star in 1..(2 * line - 1)) print("*") // 별표
        println()
    }
}