package chap08.section1

// 공변성 선언
class Box2<out T>(val size: Int)

class Box3<in T>(val size: Int)

fun main() {
    val anys: Box2<Any> = Box2<Int>(10) // 관계성립으로 객체 생성가능
//    val nothings: Box2<Nothing> = Box2<Int>(20) // 자료형 불일치 오류

//    val anys2:Box3<Any> = Box3<Int>(10) // 자료형 불일치 오류
    val nothings2: Box3<Nothing> = Box3<Int>(20) //관계성립으로 객체 생성가능
}

