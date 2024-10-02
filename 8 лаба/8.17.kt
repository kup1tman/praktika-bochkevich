fun factorial(n: Int): Int {
    if (n == 0) {
        return 1
    } else {
        return n * factorial(n - 1)
    }
}
fun main() {
    println("Введите число: ")
    val number = readln().toInt()
    println("Факториал числа равен: ${factorial(number)}")
}