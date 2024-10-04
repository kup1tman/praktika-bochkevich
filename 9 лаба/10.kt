fun longestWord(input: String): String {
    val words = input.split("\\s+|[,.!?;]".toRegex()).filter { it.isNotEmpty() }
    return words.maxByOrNull { it.length } ?: ""
}
fun main() {
    val String = "Привет мир, я ЯНААААААААААА"
    val result = longestWord(String)
    println("Самое длинное слово: $result")
}