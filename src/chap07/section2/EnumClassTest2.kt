package chap07.section2

interface Score {
    fun getScore(): Int
}

enum class MemberType(var prio: String) : Score { // Score를 구현할 열거형 클래스
    NORMAL("Thrid") { // 구현 메서드
        override fun getScore(): Int = 100
    },
    SILVER("Second") {
        override fun getScore(): Int = 500
    },
    GOLD("First") {
        override fun getScore(): Int = 1500
    }
}

fun main() {
    println(MemberType.NORMAL.getScore())
    println(MemberType.GOLD)
    println(MemberType.valueOf("SILVER"))
    println(MemberType.SILVER.prio)
    println()

    for (grade in MemberType.values()) { // 모든값을 가져오는 반복문
        println("grade.name = ${grade.name}, prio = ${grade.prio}")
    }
}