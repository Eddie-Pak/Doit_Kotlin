package chap08.section1

class Box<T>(t: T) { // 형식 매개변수로 받은 인자를 name에 저장
    var name = t
}

//class MyClass<T> { // 1개의 형식 매개변수를 가지는 클래스
//    fun myMethod(a: T) { // 메서드의 매개변수 자료형에 사용됨
//        println("method")
//    }
//    val myProp: T // 오류! 프로퍼티는 초기화되거나 abstract로 선언되어야 함
//}

//class MyClass<T>(val myProp: T) {} // 주생성자의 프로퍼티

class MyClass<T> {
    val myProp: T // 프로퍼티
    constructor(myProp: T) { // 부생성자 이용
        this.myProp = myProp
    }
}

fun main() {
    val box1: Box<Int> = Box<Int>(1)
    val box2: Box<String> = Box<String>("Hello")
    val box3 = Box(2) // 1은 Imt형이므로 Box<Int>로 추론
    val box4 = Box("Hello!") // 마찬가지로 추론

    var a = MyClass<Int>(12)

    println(box1.name)
    println(box2.name)
    println(box3.name)
    println(box4.name)

    println(a.myProp)
    println(a.javaClass)
}