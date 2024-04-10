package chap06.section1

class User(_id: Int, _name: String, _age: Int) {
    val id: Int = _id // 불변(읽기전용)
    var name: String = _name // 변경가능
    var age: Int = _age // 변경가능
}

fun main() {
    val user = User(1, "Sean", 30)
    val name = user.name // 게터에 의한 값 획득

    user.age = 41 // 세터에 의한 값 지정
    println("name: $name, ${user.age}")
    // user.id = 2 val로써 읽기 전용으로 다시 지정 불가
}