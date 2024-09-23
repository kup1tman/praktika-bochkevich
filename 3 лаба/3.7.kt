fun main() {
    println("Введите вещественное число 1: ")
    val a = readln().toDouble()
    println("Введите вещественное число 2: ")
    val b = readln().toDouble()

    if (a>b) {
        println("$a больше чем $b")
    } else {
        println("$a меньше чем $b")
    }
}
