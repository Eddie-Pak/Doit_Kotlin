package chap07.section1

open class Animal(val name: String)

// feeding의 구현을 위해 인터페이스 Pet 지정
class Dog(name: String, override var category: String) : Animal(name), Pet {
    override var species: String = "dog"
    override fun feeding() {
        println("Feed the dog a bone")
    }
}

class Master {
//    fun playWithPet(dog: Dog) { // 각 애완동물 종류에 따라 오버로딩됨
//        println("Enjoy with my dog.")
//    }
//    fun playWithPet(cat: Cat) { // 고양이를 위한 메서드
//        println("Enjoy with my Cat.")
//    }
    fun playWithPet(pet: Pet) { // 인터페이스를 객체로 매개변수를 지정
        println("Enjoy with my ${pet.species}")
    }
}

fun main() {
    val master = Master()
    val dog = Dog("Toto", "small")
    val cat = Cat("Coco", "BigFat")
    master.playWithPet(dog)
    master.playWithPet(cat)
}