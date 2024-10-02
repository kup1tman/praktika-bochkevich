fun findMax(numbers: IntArray): Int {
    var max = numbers[0] 
    for (i in 1 until numbers.size) {
        if (numbers[i] > max) {
            max = numbers[i] 
        }
    }
    return max
}
fun main() {
    val numbers = intArrayOf(5, 2, 9, 1, 7)
    val maxNumber = findMax(numbers)
    println("Максимальное значение в массиве: $maxNumber")
}