fun Number(n: Int): List<Int> {
    return if (n > 0) {
        (n downTo 1).toList()
    } else {
        emptyList()
    }
}
fun main() {
    println("Введите число: ")
    val n = readln().toInt()
    println(Number(n))
}