fun reverseArray(array: IntArray): IntArray {
    val reversedArray = array.reversedArray()
    return reversedArray
}
fun main() {
    val numbers = intArrayOf(1, 2, 3, 4, 5, 6, 7)
    val rn = reverseArray(numbers)
    println(rn.joinToString(" "))
}