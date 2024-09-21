fun main() {
    println("Введите число:")
    val n = readln().toInt()
    var sum = 0
    for (i in 1..n) {
        sum += i * i
    }
    println("Сумма квадратов чисел от 1 до $n = $sum")
}
