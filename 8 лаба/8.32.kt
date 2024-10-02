fun reverseString(text: String): String {
    return text.reversed()
}
fun main() {
    val text = "Привет ГОЙДА"
    val reversedText = reverseString(text)
    println(reversedText)
}