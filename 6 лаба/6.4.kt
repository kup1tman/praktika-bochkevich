fun main() {
    print("Исходный массив: ")
    val numbers = arrayOf(10, 100, 5, 66, 1, 999, 32)
    for (number in numbers) {
        print("[$number]")
    }
    println()
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