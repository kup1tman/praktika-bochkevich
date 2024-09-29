fun main() {
    val numbers = intArrayOf(1, 2, 3, 4, 5)
    var sum = 0
    for (number in numbers) {
        sum += number
    }
    val a = sum.toDouble() / numbers.size
    println("Среднее арифметическое = $a")
}