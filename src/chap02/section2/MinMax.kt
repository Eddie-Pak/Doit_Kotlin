package chap02.section2

fun main() {
    val han = '가'
    val eng = 'A'

    println("Byte min:${Byte.MIN_VALUE} max:${Byte.MAX_VALUE}")
    println("Short min:${Short.MIN_VALUE} max:${Short.MAX_VALUE}")
    println("Int min:${Int.MIN_VALUE} max:${Int.MAX_VALUE}")
    println("Long min:${Long.MIN_VALUE} max:${Long.MAX_VALUE}")
    println("Float min:${Float.MIN_VALUE} max:${Float.MAX_VALUE}")
    println("Double min:${Double.MIN_VALUE} max:${Double.MAX_VALUE}")

    println(han + 1)
    println(eng + 1)
}