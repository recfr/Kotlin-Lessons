package basics

fun  main() {
    /*
    val numbers = arrayOf(13, 55, 65, 45, 87 ,10)
    val name = arrayOf("Ahmet", "Ayse", "Veli", "Derya")
    val firstCharOfNames = arrayOf('A', 'A', 'V', 'D')
    val mixedArray = arrayOf(13, "Ahmet", 'V', true)
    val arrayOfNulls = arrayOfNulls<String>(size 4)

    val carNames = Array<String>(size 5) {
        (it * it).toString()
    }
    print(mixedArray)
*/
    val rawPineTree = """
              *
             ***
            *****
    """.trimIndent()
    println(rawPineTree)
}