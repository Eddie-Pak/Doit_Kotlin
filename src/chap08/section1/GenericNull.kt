package chap08.section1

class GenericNull<T> { // 기본적으로 null이 허용되는 형식 매개변수 / GenericNull<T: Any> 자료형이 Any가 지정되어 null을 허용하지 않음
    fun EqualityFunc(arg1: T, arg2: T) {
        println(arg1?.equals(arg2))
    }
}

fun main() {
    val obj = GenericNull<String>() // non-null로 선언됨
    obj.EqualityFunc("Hello", "World") // null이 허용되지 않음

    val obj2 = GenericNull<Int?>() // null이 가능한 형식으로 선언됨
    obj2.EqualityFunc(null, 10) // null 사용
}