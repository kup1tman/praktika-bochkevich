fun sortArray(numbers: IntArray): IntArray {
    val sortedNumbers = numbers.clone()
    for (i in 0 until sortedNumbers.size - 1) {
        for (j in i + 1 until sortedNumbers.size) {
            if (sortedNumbers[i] > sortedNumbers[j]) {
                val temp = sortedNumbers[i]
                sortedNumbers[i] = sortedNumbers[j]
                sortedNumbers[j] = temp
            }
        }
    }
    return sortedNumbers
}
fun main() {
    val numbers = intArrayOf(33, 2, 9, 1, 6, 10)
    val sortedNumbers = sortArray(numbers)
    println("Отсортированный массив: ${sortedNumbers.joinToString(" ")}")
}