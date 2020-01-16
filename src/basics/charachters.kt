package basics

fun main() {
    val firstChar : Char = 'A'
//    val firstChar : Char = "A"
    val charNumber : Char = '5'

    println(firstChar)
    println(charNumber)

    val escapeCharT : Char = '\t'
    val escapeCharN : Char = '\n'
    val escapeCharB : Char = '\b'
    val escapeCharR : Char = '\r'
    val escapeChar1 : Char = '\''
    val escapeChar2 : Char = '\"'
    val escapeCharSlash : Char = '\\'
    val escapeCharDolar : Char = '\$'

    val loremIpsum = "Lorem IpsumT " + escapeCharT +
            "Lorem IpsumN " + escapeCharN +
            "Lorem IpsumB " + escapeCharB +
            "Lorem IpsumR " + escapeCharR +
            "Lorem Ipsum1 " + escapeChar1 +
            "Lorem Ipsum2 " + escapeChar2 +
            "Lorem IpsumSlash " + escapeCharSlash +
            "Lorem IpsumDolar " + escapeCharDolar + "Lorem IpsumEnd"

    println(loremIpsum)
    val uniCode = '\uFF00'
    println("uFF00 : " + uniCode)
}