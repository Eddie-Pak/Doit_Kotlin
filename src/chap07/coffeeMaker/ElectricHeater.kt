package chap07.coffeeMaker

class ElectricHeater(var heating: Boolean = false) : Heater {
    override fun on() {
        println("[ElectricHeater] heating...")
        heating = true
    }

    override fun off() {
        heating = false
        println("[ElectricHeater] off...")
    }

    override fun isHot(): Boolean = heating
}