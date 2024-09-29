fun main() {
    println("Введите числа, разделённые пробелами:")
    val input = readLine() ?: ""
    val numbers = input.split(" ").mapNotNull { it.toIntOrNull() }
    val minNumber = numbers.minOrNull()
    if (minNumber != null) {
        println("Самое маленькое число: $minNumber")
    } else {
        println("Список чисел пуст.")
    }
}