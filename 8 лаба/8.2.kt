fun minusNumbers(): Int {
    println("Введите числа, разделенные пробелом:")
    val input = readln()
    val numbers = input.split(" ").map { it.toInt() }
    var min = numbers[0]
    var max = numbers[0]
    for (number in numbers) {
        if (number > max) {
            max = number
        }
        if (number < min) {
            min = number
        }
    }
    val minus = max - min
    return minus
}

fun main() {
    print("Разность максимального и минимального элемента: ${minusNumbers()}")
}