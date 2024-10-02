fun Strings(str1: String, str2: String): String {
    return "$str1$str2"
}
fun main() {
    val str1 = "ГОЙ"
    val str2 = "ДА"
    val combinedString = Strings(str1, str2)
    println(combinedString)
}
