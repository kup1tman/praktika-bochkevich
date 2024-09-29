fun main() {
    val numbers = intArrayOf(1, 2, 3, 4, 5)
    var length = 0
    print("Исходный массив = ")
    for (number in numbers) {
        print("$number ")
    }
    println()
    print("Обратный массив = ")
    for (number in numbers) {
        length++
    }
    for (i in length - 1 downTo 0) {
        print("${numbers[i]} ")
    }
}