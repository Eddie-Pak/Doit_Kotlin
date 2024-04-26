package chap07.section3

class Point(var x: Int = 0, var y: Int = 10) {
    // plus() 함수의 연산자 오버로딩
    operator fun plus(p: Point) : Point {
        return Point(x + p.x, y + p.y)
    }
    operator fun dec() = Point(--x, --y)
}

class Manager {
    operator fun invoke(value: String) {
        println(value)
    }
}

fun main() {
    val p1 = Point(3, -8)
    val p2 = Point(2, 9)

    var point = Point()
    point = p1 +p2 // Point 객체의 + 연산이 가능하게 됨
    println("point = (${point.x}, ${point.y})")

    --point // --연산자
    println("point = (${point.x}, ${point.y})")

    val manager = Manager()
    manager("Do something for me!") // manager.invoke("...") 형태로 호출되며 invoke가 생략됨
}