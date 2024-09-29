fun main() {
    val numbers = intArrayOf(5, 1, 9, 3, 7)
    var largest = numbers[0]
    var sLargest = numbers[1]
    if (sLargest > largest) {
        val temp = largest
        largest = sLargest
        sLargest = temp
    }
    for (i in 2 until numbers.size) {
        if (numbers[i] > largest) {
            sLargest = largest
            largest = numbers[i]
        } else if (numbers[i] > sLargest && numbers[i] != largest) {
            sLargest = numbers[i]
        }
    }
    println("Второй по величине элемент в массиве: $sLargest")
}