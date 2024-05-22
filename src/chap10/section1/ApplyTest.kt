package chap10.section1

fun main() {
    data class Person(var name: String, var skills: String)
    var person = Person("Kildong", "Kotlin")

    person.apply { this.skills = "Swift" } // 여기서 this는 person객체를 가리킴
    println(person)

    val returnObj = person.apply {
        name = "Sean" // this는 생략할 수 있음
        skills = "Java" // this 없이 객채의 멤버에 여러 번 접근
    }
    println(person)
    println(returnObj)

//    person.also { it.skills = "Java" } // it으로 받고 생략할 수 없음
//    person.apply { skills = "Swift" } // this로 받고 생략


    // 디렉터리를 생성할 때 apply()함수 활용하기
//    fun makeDir(path: String): File {
//        val result = File(path)
//        result.mkdirs()
//        return result
//    }
//    File(path).apply {mkdirs()}
}