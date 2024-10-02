fun isPalindrome(text: String): Boolean {
    val cleanText = text.lowercase().replace(" ", "")
    val reversedText = cleanText.reversed()
    return cleanText == reversedText
}
fun main() {
    println(isPalindrome("Привет мир"))
}