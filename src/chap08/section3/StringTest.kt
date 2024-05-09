package chap08.section3

fun main() {
    val hello: String = "Hello World!"
    println(hello[0]) // H
//    hello[0] = 'K' // 오류
    var s = "abcdef"
    s = "xyz"
    println(s) // 새로운 메모리 공간이 생성
    s = "abcdef"
    println(s.substring(0..2)) // 인덱스 0~2번 범위의 abc 반환

    s = s.substring(0..1) + "x" + s.substring(3..s.length-1)
    println(s)

    var s1 = "Hello Kotlin"
    var s2 = "Hello KOTLIN"
    // 같으면 0, s1<s2이면 양수, 반대면 음수를 반환
    println(s1.compareTo(s2))
    println(s1.compareTo(s2, true)) // 대소문자 무시

    var a = StringBuilder("Hello")
    a[2] = 'x' // 허용되지 않았던 요소의 변경이 가능함
    println(a)

    a.append("World") // 문자열이 추가되어 HexloWorld
    println(a)
    a.insert(10, "Added") // 인덱스 10번부터 추가되어 HexloWorldAdded
    println(a)
    a.delete(5, 10) // 인덱스 5번부터 10번 전까지 삭제되어 HexloAdded
    println(a)

    var deli = "Welcome to Kotlin"
    val sp = deli.split(" ")
    println(sp)

//    val number: Int = "123".toInt()
//    try {
//        "12w".toInt()
//    } catch (e: NumberFormatException) {
//        println(e.printStackTrace())
//    }
    val number: Int = "123".toInt()
    try {
        "12w".toIntOrNull() // 숫자가 아닌 문자가 포함되었을때 null을 반환한다.
    } catch (e: NumberFormatException) {
        println(e.printStackTrace())
    }

    val str = "\tYou're just too \"good\" to be true\n\tI can't take my eyes off you"
    val uni = "\uAC00" // 한글코드의 범위 AC00-D7AF
    println(str)
    println(uni)

    val text = """
        |Tell me and I forget.
        |Teach me and I remember.
        |Involve me and I learn.
        |(Benjamin Franklin)
    """.trimMargin() // trim default는 |
    println(text)

    val pi = 3.1415926
    val dec = 10
    val b = "hello"
    println("pi = %.2f, %3d, %s".format(pi, dec, b))
}