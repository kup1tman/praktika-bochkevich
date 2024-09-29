fun main() {
    val numbers = intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    var max = numbers[0]
    var min = numbers[0]
    for (i in 1 until numbers.size) {
        if (numbers[i] > max) {
            max = numbers[i]
        }
        if (numbers[i] < min) {
            min = numbers[i]
        }
    }
    println("Максимальное значение массива = $max")
    println("Минимальное значение массива = $min")
}