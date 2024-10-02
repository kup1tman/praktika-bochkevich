fun copyArray(array: IntArray): IntArray {
    val newArray = array.copyOf()
    return newArray
}
fun main() {
    val numbers = intArrayOf(1, 2, 3, 4, 5)
    val cn = copyArray(numbers)
    println(cn.joinToString(" "))
}