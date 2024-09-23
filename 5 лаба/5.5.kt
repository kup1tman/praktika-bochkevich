fun main() {
    println("Введите число:")
    val n = readln().toInt()
    var a = true
    if (n <= 1) {
        a = false
    } else {
        for (i in 2 until n) {
            if (n % i == 0) {
                a = false
                break
            }
        }
    }
    if (a) {
        println("$n - простое число")
    } else {
        println("$n - не простое число")
    }
}
