package chap08.section2

import java.util.*

fun main() {
    // deepToString() 다차원 배열 표시
    val array = arrayOf(intArrayOf(1,2), intArrayOf(3,4), intArrayOf(5,6,7))
    println(Arrays.deepToString(array))

    // 표현식을 통해 배열 생성하기
    val arr1 = Array(5, {i -> i * 2})
    println("arr2: ${Arrays.toString(arr1)}")

//    var a1 = arrayOfNulls<Int>(1000) // 1000개의 null로 채워진 정수배열
//    var a2 = Array(1000, {0}) // 0으로 채워진 배열
//    var a3 = Array(1000, {i -> myClass(i)}) // 특정 클래스객체로 뱌열을 만들려면 다양한 람다식 표현법으로 필요한 요소를 생성

    val arr2 = intArrayOf(1, 2, 3, 4, 5) // 5개로 고정된 배열
    val arr3 = arr2.plus(6) // 하나의 요소를 추가한 새 배열 생성
    val arr4 = arr2.sliceArray(0..2) // 필요한 범위를 잘라내 새 배열생성

    println("arr3: ${Arrays.toString(arr3)}")
    println("arr4: ${Arrays.toString(arr4)}")

    println(arr1.first()) // 첫 번째 요소 확인
    println(arr1.last()) // 마지막 요소 확인

    println("indexOf(3): ${arr1.indexOf(3)}") //요소 3의 인덱스 출력
    println("average: ${arr1.average()}") // 배열의 평균 값 출력
    println("count: ${arr1.count()}") // 요소 개수 세기

    // 요소의 순서를 완전히 뒤집는 reversedArray(), reverse(), 요소를 합산하는 sum(), 주어진 요소를 채우는 fill()
    // 배열에 특정요소가 포함되어 있는지 확인하는 contain()

    println(arr1.contains(4)) // arr1 배열에 요소 4가 포함되어 있는지 확인 boolean
    println(4 in arr1)
}