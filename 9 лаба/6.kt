fun sortStrings(strings: Array<String>): Array<String> {
    val sortedStrings = strings.clone()
    sortedStrings.sort()
    return sortedStrings
}
fun main() {
    val strings = arrayOf("духанина", "яна", "алексеевна")
    val sortedStrings = sortStrings(strings)
    println("Отсортированный массив: ${sortedStrings.joinToString(" ")}")
}