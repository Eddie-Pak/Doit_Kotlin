package chap07.section2

interface Switcher { // 인터페이스의 선언
    fun on(): String
}

class Smartphone(val model: String) {
    private val cpu = "Exynos"

    inner class ExternalStorage(val size: Int) {
        fun getInfo() = "${model}: Installed on $cpu with ${size}Gb" // 바깥클래스이 프로퍼티 접근
    }
    fun powerOn(): String {
        class Led(val color: String) { // 지역클래스 선언
            fun blink(): String = "Blinking $color on $model" // 외부의 프로퍼티는 접근 가능
        }
        val powerStatus = Led("Red") // 여기에서 지역클래스가 사용됨
        val powerSwitch = object : Switcher { // 익명객체를 사용해 Switcher의 on()구현
            override fun on(): String {
                return powerStatus.blink()
            }
        }
//        return powerStatus.blink()
          return powerSwitch.on()
    } // powerOn() 블록 끝
}

fun main() {
    val mySdcard = Smartphone("S7").ExternalStorage(32)
    println(mySdcard.getInfo())

    val myphone = Smartphone("Note9")
    myphone.ExternalStorage(128)
    println(myphone.powerOn())
}