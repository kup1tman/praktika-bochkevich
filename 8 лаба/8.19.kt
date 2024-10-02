fun sumArray(arr: IntArray): Int {
    var sum = 0
    for (number in arr) {
        sum += number
    }
    return sum
}
fun main() {
    val numbers = intArrayOf(1, 2, 3, 4, 5)
    val sumResult = sumArray(numbers)
    println("Сумма элементов массива: $sumResult")
}