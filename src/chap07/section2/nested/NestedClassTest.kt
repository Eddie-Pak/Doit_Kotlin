package chap07.section2.nested

class Outer {
    val ov = 5
    class Nested {
        val nv = 10
        fun greeting() = "[Nested] Hello! $nv" // 외부의 ov에는 접근 불가

        fun accessOuter() { // 컴패니언객체는 접근할 수 있음
            println(country)
            getSomething()
        }
    }
    companion object { // 컴패니언 객체는 static처럼 접근 가능
        const val country = "Korea"
        fun getSomething() = println("Get something...")
    }
    fun outside() {
        val msg = Nested().greeting() // 객체 생성 없이 중첩 클래스의 메서드 접근
        println("[Outer]: $msg, ${Nested().nv}") // 중첩클래스의 프로퍼티 접근
    }
}

fun main() {
    // static처럼 객체 생성 없이 사용
    val output = Outer.Nested().greeting()
    println(output)

    // Outer.outside() // 오류! 외부클래스의 경우는 객체를 생성해야함
    val outer = Outer()
    outer.outside()

    val accessOutput = Outer.Nested().accessOuter()
    println(accessOutput)
}