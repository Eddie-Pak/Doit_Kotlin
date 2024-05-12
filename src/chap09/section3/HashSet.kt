package chap09.section3

fun main() {
    val intsHashSet: HashSet<Int> = hashSetOf(6, 3, 4, 7) // 불변성 기능이 없음
    intsHashSet.add(5)
    intsHashSet.remove(6)
    println(intsHashSet)
}