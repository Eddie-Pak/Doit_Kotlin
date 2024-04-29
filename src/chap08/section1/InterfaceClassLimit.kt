package chap08.section1

interface InterfaceA
interface InterfaceB

class HandlerA: InterfaceA, InterfaceB
class HandlerB: InterfaceA

class ClassA<T> where T:InterfaceA, T:InterfaceB // 2개의 인터페이스를 구현하는 클래스로 제한

fun <T> myMax(a: T, b: T): T where T:Number, T:Comparable<T> { // 비교형인 Comparable 인터페이스는 특정 객체를 비교하는 클래스의 구현을 위해 사용하는 인터페이스이다.
    return if (a > b) a else b
}

fun main() {
    val obj1 = ClassA<HandlerA>() // 객체생성가능
//    val obj2 = ClassA<HandlerB>() // 범위에 없으므로 오류 발생

    val maxMin = myMax(12, 10)

    println(maxMin)
    println(myMax(5, 10))
}