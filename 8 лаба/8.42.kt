fun findFirstIndexOf(array: IntArray, element: Int): Int {
    for (i in array.indices) {
        if (array[i] == element) {
            return i
        }
    }
    return -1
}
fun main() {
    val numbers = intArrayOf(1, 2, 3, 4, 5)
    println(findFirstIndexOf(numbers, 3))
}