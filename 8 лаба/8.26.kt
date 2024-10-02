fun LastElement(array: IntArray): Int {
    return array[array.size - 1]
}
fun main() {
    val numbers = intArrayOf(1, 2, 3, 4, 5)
    val lastElement = LastElement(numbers)
    println("Последний элемент массива: $lastElement")
}