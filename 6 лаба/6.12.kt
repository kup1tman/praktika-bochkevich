fun main() {
    val numbers = intArrayOf(1, 2, 3, 4, 5)
    println("Исходный массив:")
    printArray(numbers)
    swapElements(numbers, 1, 3)
    println()
    println("Массив после перестановки:")
    printArray(numbers)
}
fun swapElements(numbers: IntArray, index1: Int, index2: Int) {
    val temp = numbers[index1]
    numbers[index1] = numbers[index2]
    numbers[index2] = temp
}
fun printArray(numbers: IntArray) {
    for (number in numbers) {
        print("$number ")
    }
}