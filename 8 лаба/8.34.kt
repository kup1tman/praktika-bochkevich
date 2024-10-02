fun removeSpaces(text: String): String {
    return text.replace(" ", "")
}
fun main() {
    val text = "Привет мир"
    val result = removeSpaces(text)
    println(result)
}
