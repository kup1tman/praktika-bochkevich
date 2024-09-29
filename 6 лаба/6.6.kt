fun main() {
    val numbers = intArrayOf(1, 2, 3, 4, 5)
    val evenNumbers = mutableListOf<Int>()
    val oddNumbers = mutableListOf<Int>()
    for (number in numbers) {
        if (number % 2 == 0) {
            evenNumbers.add(number)
        } else {
            oddNumbers.add(number)
        }
    }
    print("Четные числа в массиве = ")
    for (number in evenNumbers) {
        print("$number ")
    }
    println()
    print("Нечетные числа в массиве = ")
    for (number in oddNumbers) {
        print("$number ")
    }
}