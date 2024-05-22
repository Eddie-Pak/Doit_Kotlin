package chap10.section1

fun main() {
    data class Person(var name: String, var skills: String)

    var person = Person("Kildong", "Kotlin")
    val a = person.let {
        it.skills = "Android"
        "Success" // 마지막 문장을 결과로 반환
    }
    println(person)
    println("a: $a")

    val b = person.also {
        it.skills = "Java"
        "Success" // 마지막 문장은 사용되지 않음
    }
    println(person)
    println("b: $b")

//    // 기존의 디렉터리 생성 함수
//    fun makeDir(path: String): File {
//        val result = File(path)
//        result.mkdirs()
//        return result
//    }
//
//    // let(), also()를 통해 개선된 함수
//    fun makeDir(path: String) = path.let { File(it) }.also { it.mkdirs() }
}