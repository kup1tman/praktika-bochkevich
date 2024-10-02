fun createArray(n: Int): IntArray {
    return IntArray(n) { i -> i + 1 }
}
fun main() {
    print("Создаём массив от 1 до ")
    val n = readln().toInt()
    val numbers = createArray(n)
    println("Массив: ${numbers.joinToString(" ")}")
}