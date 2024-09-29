fun main() {
    val numbers = intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val elementToRemove = 3
    val newNumbers = removeElement(numbers, elementToRemove)
    println("\nМассив после удаления элемента $elementToRemove:")
    printArray(newNumbers)
}
fun removeElement(numbers: IntArray, elementToRemove: Int): IntArray {
    val newNumbers = IntArray(numbers.size - 1)
    var j = 0
    for (i in numbers.indices) {
        if (numbers[i] != elementToRemove) {
            newNumbers[j++] = numbers[i]
        }
    }
    return newNumbers
}
fun printArray(numbers: IntArray) {
    for (number in numbers) {
        print("$number ")
    }
}