package chap03.section3

fun main() {
    twoLambda({ a, b -> "First $a $b" }, { "Second $it" })
    twoLambda ({ a, b -> "First $a $b" }) { "Second $it" } // 위와 동일

    // 함수에 2개의 람다식이 정의되어 있는 경우 함수의 소괄호를 생략할 수 없다. 하지만 마지막 인자는 소괄호 밖에 둘수있다
    // Ex) ({첫 번째}) {두번째} or ({첫 번째}, {두 번째}) {세 번쨰}
}

fun twoLambda(first: (String, String) -> String, second: (String) -> String) {
    println(first("OneParam", "TwoParam"))
    println(second("OneParam"))
}