fun toUpperCase(text: String): String {
    return text.uppercase()
}
fun main() {
    val text = "гойда"
    val upperCaseText = toUpperCase(text)
    println(upperCaseText)
}