package functions

fun main() {
    val pi: Double = 3 + 0.14
    println(pi)

    val schoolNumber: Int = 340
    println(schoolNumber)

    val tcIdNumber: Long = 14785236978
    println(tcIdNumber)

    (3 + 0.14).log("")
    340.log("")
    14785236978.log("")

    pi.log("")

    val result: Int = "3".extPlus("5")
    val result2: Int = "3" extPlus "5"

    "3" extPlus "5" log "" //log fonksiyonu infix yapılınca bu şekilde kullanabildik

    val shape = Shape()
    shape.calculateArea(45)
}

infix fun Number.log(emptyParam: String) {
    println(this)   //this= extend edilen classı gösteriyor
}

infix fun String.extPlus(otherString: String): Int = this.toInt() + otherString.toInt()


class Shape {
//    fun calculateArea(edge : Int) : Int {
//        return edge * edge
//    }

    fun calculateArea(edge: Int): Int = edge * edge

    fun Int.toShort(): Short {
        return this.toShort()
    }

}


fun Shape.calculateArea(edge: Int): Int {
    val result = edge * edge
    println(result)
    return result
}