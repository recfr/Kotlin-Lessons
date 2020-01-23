package functions

fun main() {
    val isStudent = false
    val isMale = true

    if (!isStudent and isMale) {
        print("Öğrenci Olmayan Erkek")
    }

    //val result = Math.pow(2.0, 3.0) //örnek: üstel ifade -> 2^3

    val awesomeInstance = AwesomeClass()
    awesomeInstance downloadImage "www.google.com.tr"


}

class AwesomeClass {
    infix fun downloadImage(imageUrl: String) {

    }

    infix fun specialPlus(number: Int) {

    }


}