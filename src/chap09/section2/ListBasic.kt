package chap09.section2

fun main() {
    // 불변형 List의 사용
    var numbers: List<Int> = listOf(1, 2, 3, 4, 5)
    var names: List<String> = listOf("one", "two", "three")
    var mixedTypes = listOf("Hello", 1, 2.445, 's') // 형식매개변수가 <Any>를 가져 서로다른 자료형을 가진 요소를 선언할수 있다.

    for (name in names) {
        println(name)
    }
    for (num in numbers) print(num) // 한줄에서 처리하기
    println() // 내용이 없을 때는 한줄 내리는 개행 \n
}