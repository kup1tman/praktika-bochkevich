fun main() {
    val array1 = intArrayOf(1, 3, 5)
    val array2 = intArrayOf(2, 4, 6)
    val Array = mergeArrays(array1, array2)
    println("Объединенный массив: ${Array.joinToString(", ")}")
}
fun mergeArrays(vararg arrays: IntArray): IntArray {
    val mergedSize = arrays.sumOf { it.size }
    val mergedArray = IntArray(mergedSize)
    var index = 0
    for (array in arrays) {
        for (element in array) {
            mergedArray[index++] = element
        }
    }
    return mergedArray
}