fun countVowels(text: String): Int {
    val vowels = setOf('а', 'о', 'е', 'э', 'и', 'ы','у','ё','ю','я')
    var count = 0
    for (char in text.lowercase()) {
        if (char in vowels) {
            count++
        }
    }
    return count
}
fun main() {
    val text = "Привет мир"
    val vowelCount = countVowels(text)
    println(vowelCount)
}
