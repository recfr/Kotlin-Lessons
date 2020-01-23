package functions

fun main() {

}

fun calculateAtomPhysics() {
    println("Initialize Process...")

/*    val numberOne = readLine()!!.toInt()
    val numberTwo = readLine()!!.toInt()
    val result = numberOne + numberTwo
    println("$result")

    val numberThree = readLine()!!.toInt()
    val numberFour = readLine()!!.toInt()
    val result2 = numberThree + numberFour
    println("$result2")
*/

    //aşağıdaki kullanım local functions olarak adlandırılıyor
    //gizlilik için kullanılıyor. mutlaka method çağırımından önce yazılması gerekiyor.
    fun getValuesFromUserAndPrint() {
        val numberOne = readLine()!!.toInt()
        val numberTwo = readLine()!!.toInt()
        val result = numberOne + numberTwo
        println("$result")
    }
    getValuesFromUserAndPrint()
    getValuesFromUserAndPrint()

    println("Process has been done.")
}

