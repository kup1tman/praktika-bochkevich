fun sum(n: Int): Int {
    return (n * (n + 1)) / 2
}
fun main() {
    println("Введите число: ")
    val n = readln().toInt()
    val sum = sum(n)
    println("Сумма чисел от 1 до $n: $sum")
}