fun main() {
    val numbers = arrayOf(44, 27, 61, 32, 89)
    for (i in 0 until numbers.size - 1) {
        for (j in 0 until numbers.size - i - 1) {
            if (numbers[j] > numbers[j + 1]) {
                val t = numbers[j]
                numbers[j] = numbers[j + 1]
                numbers[j + 1] = t
            }
        }
    }
    println("Отсортированный массив: ${numbers.contentToString()}")
}
