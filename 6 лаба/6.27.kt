fun main() {
    val numbers = intArrayOf(2, 2, 1, 1, 1, 3, 3, 3, 3)
    var maxSequenceLength = 1
    var maxSequenceStart = 0
    var currentSequenceLength = 1
    var currentSequenceStart = 0

    for (i in 1 until numbers.size) {
        if (numbers[i] == numbers[i - 1]) {
            currentSequenceLength++
        } else {
            if (currentSequenceLength > maxSequenceLength) {
                maxSequenceLength = currentSequenceLength
                maxSequenceStart = currentSequenceStart
            }
            currentSequenceLength = 1
            currentSequenceStart = i
        }
    }
    if (currentSequenceLength > maxSequenceLength) {
        maxSequenceLength = currentSequenceLength
        maxSequenceStart = currentSequenceStart
    }
    println("Максимальная последовательность:")
    for (i in maxSequenceStart until maxSequenceStart + maxSequenceLength) {
        print("${numbers[i]} ")
    }
    println()
    println("Длина максимальной последовательности: $maxSequenceLength")
}