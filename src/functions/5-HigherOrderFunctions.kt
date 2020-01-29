package functions

fun main() {
    printUserInfo(getName(), { surName -> "surname : $surName" }, getAge())
}

fun getName(): String {
    return "Recep"
}

fun getAge(): Int = 26

fun printUserInfo(name: String, getSurname: (surName: String) -> String, age: Int): Unit {
    println("name: $name age: $age")

    println(getSurname("Fırıncıoğlu"))
}

