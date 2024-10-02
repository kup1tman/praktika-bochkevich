fun findIndex(array: IntArray, index: Int): Int {
    return array[index]
}
fun main() {
    val numbers = intArrayOf(1, 2, 3, 4, 5)
    println("Введите номер индекса в массиве: ")
    val index= readln().toInt()
    val element = findIndex(numbers, index)
    println("Элемент по индексу $index: $element")
}