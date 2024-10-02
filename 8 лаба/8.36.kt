fun containsSubstring(text: String, substring: String): Boolean {
    return text.contains(substring)
}
fun main() {
    val text = "Привет гойда"
    val text2 = "гойда"
    println(containsSubstring(text, text2))
}