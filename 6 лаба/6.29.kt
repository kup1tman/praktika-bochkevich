fun main() {
    val numbers = intArrayOf(1, 3, 7, 9, 4, 6, 8)
    numbers.sort()
    val middleIndex = numbers.size / 2
    val median = if (numbers.size % 2 == 0) {
        (numbers[middleIndex - 1] + numbers[middleIndex]).toDouble() / 2
    } else {
        numbers[middleIndex].toDouble()
    }
    println("Медиана: $median")
}