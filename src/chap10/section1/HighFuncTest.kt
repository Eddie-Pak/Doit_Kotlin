package chap10.section1

fun main() {
    val isPositive: (Int) -> Boolean = {
        val isPositive = it > 0
        isPositive // 마지막 표현식이 반환됨
    }

    val isPositiveLabel: (Int) -> Boolean = number@{
        val isPositive = it > 0
        return@number isPositive // 라벨을 사용해 반환됨
    }

    val result1 = high("Sean", { x -> inc(x + 3) }) // 함수를 이용한 람다식
    val result2 = high("Sean") { inc(it + 3) } // 소괄호 바깥으로 빼내고 생략
    val result3 = high("Kim", ::inc) // 매개변수 없이 함수의 이름만 사용할 때
    val result4 = high("Sean") { x -> x + 3 } // 람다식 자체를 넘겨준 형태
    val result5 = high("Sean") { it + 3 } // 매개변수가 1개인 경우 생략

    println(result1)
    println(result2)
    println(result3)
    println(result4)
    println(result5)
}

fun inc(x: Int): Int {
    return x + 1
}

fun high(name: String, body: (Int) -> Int): Int {
    println("name: $name")
    val x = 0
    return body(x)
}