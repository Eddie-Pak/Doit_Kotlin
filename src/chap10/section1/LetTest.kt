package chap10.section1

fun main() {
    val score: Int? = 32

    // 일반적인 null 검사
    fun checkScore() {
        if (score != null) {
            println("Score: $score")
        }
    }

    // let 함수를 사용해 null 검사를 제거
    fun checkScoreLet() {
        score?.let { println("Score: $it") }
        val str = score.let { it.toString() }
        println(str)
    }

    checkScore()
    checkScoreLet()

    val firstName: String? = "Kil Dong"
    val lastName: String = "Hong"

    fun checkNames() {
        if (null != firstName) {
            print("$firstName $lastName")
        } else {
            print("$lastName")
        }
    }

    fun checkNamesLet() {
        firstName?.let { print("$it $lastName") } ?: print("$lastName")
    }

    checkNames()
    checkNamesLet()
    println()

    // 메서드 체이닝을 사용한 let() 함수
    var a = 1
    var b = 2
    a = a.let { it + 2 }.let {
        val i = it + b
        i
    }
    println(a)
}