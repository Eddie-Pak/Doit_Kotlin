package chap07.section2

enum class Direction { // 동서남북 네방향을 각각 변수로 선언하는 열거형 클래스
    NORTH, SOUTH, WEST, EAST
}

enum class DayOfWeek(val num: Int) {
    MONDAY(1), TUESDAY(2), WEDNESDAY(3), THURSDAY(4),
    FRIDAY(5), SATURDAY(6), SUNDAY(7)
}

fun dayPrint() {
    val day = DayOfWeek.SATURDAY // 값읽기
    when(day.num) {
        1, 2, 3, 4, 5 -> println("Weekday")
        6, 7 -> println("Weekend!")
    }
}

enum class Color(val r:Int, val g: Int, val b: Int) {
    RED(255, 0, 0), ORANGE(255, 165, 0), YELLOW(255, 255, 0),
    GREEN(0, 255, 0), BLUE(0, 0, 255), INDIGO(75, 0, 130), VIOLET(238, 130, 238); // 세미콜론으로 끝을 알림

    fun rgb() = (r * 256 + g) * 256 + b // 메서드를 포함할수 있음
}

fun getColor(color: Color) = when (color) {
    Color.RED -> color.name // 이름가져오기
    Color.ORANGE -> color.ordinal // 순서번호: 1
    Color.YELLOW -> color.toString() // 문자열 반환
    Color.GREEN -> color // 기본값(문자열)
    Color.BLUE -> color.r // r값
    Color.INDIGO -> color.g
    Color.VIOLET -> color.rgb() // 메서드 연산결과
}

fun main() {
    println(DayOfWeek.WEDNESDAY.num)
//    println(dayPrint()) 이렇게하면 반환값이 없어 Unit으로 반환한다고 가정하여 kitlin.Unit이 출력된다.
    dayPrint()
    println(Color.BLUE.rgb())
    println(getColor(Color.BLUE))
}