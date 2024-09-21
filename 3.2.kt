fun main() {
    println("Введите первое число:")
    val a = readln().toDouble()
    println("Введите второе число:")
    val b = readln().toDouble()
    println("Введите третье число:")
    val c = readln().toDouble()

    val middle: Double

    if (a == b || a == c || b == c) {
        println("Ошибка")
    } else {
        middle = if (a > b && a > c) {
            if (b > c) b else c
        } else if (b > a && b > c) {
            if (a > c) a else c
        } else {
            if (a > b) a else b
        }

        println("Среднее число: $middle")
    }
}
