fun Element(array: IntArray, element: Int): Boolean {
    for (number in array) {
        if (number == element) {
            return true
        }
    }
    return false
}
fun main() {
    println("Введите элемент массива: ")
    val a= readln().toInt()
    val numbers = intArrayOf(1, 2, 3, 4, 5)
    println(Element(numbers, a))
}