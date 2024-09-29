fun main() {
    val numbers = intArrayOf(1, 2, 3, 5, 6, 33, 30, 9)
    print("Числа, делящиеся на 3 в массиве = ")
    for (number in numbers) {
        if (number % 3 == 0) {
            print("$number ")
        }
    }
}