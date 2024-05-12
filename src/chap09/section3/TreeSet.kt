package chap09.section3

import java.util.*

fun main() {
    // 자바의 java.utill.TreeSet선언
    val intsSortedSet: TreeSet<Int> = sortedSetOf(4, 1, 7, 2)

    intsSortedSet.add(6)
    intsSortedSet.remove(1)
    println("intsSortedSet = ${intsSortedSet}")

    intsSortedSet.clear()
    println("intsSortedSet = ${intsSortedSet}")
}