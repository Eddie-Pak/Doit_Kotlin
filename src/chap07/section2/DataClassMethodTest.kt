package chap07.section2

data class Customer(var name: String, var email: String) {
    var job: String = "Unknown"
    constructor(name: String, email: String, _job: String): this(name, email) {
        job = _job
    }
}

fun main() {
    val cus1 = Customer("Sean", "sean@mail.com")
    val cus2 = Customer("Sean", "sean@mail.com")
    val cus3 = cus1.copy(name = "Alice")
    val bob = Customer("Bob", "bob@mail,com")
    val erica = Customer("Erica", "erica@mail.com")
    val customers = listOf(cus1, cus2, bob, erica)

    val (name, email) = cus1 // Destructuring
    val name2 = cus1.component1() // 개별적 프로퍼티를 가져오기 위해 componentN() 메서드 사용
    val email2 = cus1.component2()

    println(cus1 == cus2)
    println(cus1.equals(cus2))
    println("${cus1.hashCode()}, ${cus2.hashCode()}")
    println(cus3.toString())
    println("name = $name, email = $email")
    println("name = $name2, email = $email2")
    println()

    for ((name, email) in customers) {
        println("For문 - name: $name, email: $email")
    }
    println()

    val (myName, myEmail) = myFunc()

    // 람다식을 사용해 출력해보기
    val myLamda = {
        (nameLa, emailLa): Customer ->
        println(nameLa)
        println(emailLa)
    }
    myLamda(cus1)
}

fun myFunc(): Customer {
    return Customer("Mickey", "mic@abc.com")
}