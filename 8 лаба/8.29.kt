fun findMinMax(numbers: IntArray): Pair<Int, Int> {
    var min = numbers[0]
    var max = numbers[0]

    for (i in 1 until numbers.size) {
        if (numbers[i] < min) {
            min = numbers[i]
        } else if (numbers[i] > max) {
            max = numbers[i]
        }
    }
    return Pair(min, max)
}
fun main() {
    val numbers = intArrayOf(3, 2, 9, 1, 7)
    val (min, max) = findMinMax(numbers)
    println("Минимальное значение: $min")
    println("Максимальное значение: $max")
}