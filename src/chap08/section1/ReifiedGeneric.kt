package chap08.section1

fun main() {
    val result = getType<Float>(10)
    println("result = $result")
}

inline fun <reified T> getType(value: Int): T {
    println(T::class) // 실행시간에 삭제되지 않고 사용가능
    println(T::class.java)

    return when (T::class) { // 받아들인 제너릭 자료형에 따라 반환
        Float::class -> value.toFloat() as T
        Int::class -> value as T
        else -> throw IllegalStateException("${T::class} is not supported!")
    }
}