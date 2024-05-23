package chap10.section1

import kotlin.random.Random
import kotlin.system.measureTimeMillis

fun main() {
//    // 기존코드
//    if (someObject != null && someObject.status) {
//        doThis()
//    }
//
//    // 개선된 코드
//    if (someObject?.status == true) {
//        doThis()
//    }
//
//    // takeIf()함수를 사용해 개선한 코드
//    someObject?.takeIf { it.status }?.apply { doThis() }
    // null 검사와 someObject객체의 status의 상태를 검사해 true인 경우에 apply()를 적용해 doThis()를 호출한다.

    val input = "Kootlin"
    val keyword = "in"

    // 입력 문자열에 키워드가 있으면 인덱스를 반환하는 함수를 takeIf()함수를 사용하여 구현
    input.indexOf(keyword).takeIf { it > 0 } ?: error("keyword not found")

    // takeUnless() 함수를 사용하여 구현
    input.indexOf(keyword).takeUnless { it < 0  } ?: error("keyword not found")

    // 시간의 측정 함수
    val executionTime = measureTimeMillis {
        // 측정할 작업코드
    }
    println("Execution Time = $executionTime")

    // 난수 생성하기
    val number = Random.nextInt(21) // 숫자는 난수 발생 범위
    println(number)
}