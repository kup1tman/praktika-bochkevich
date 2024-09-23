fun main() {
    println("Введите первое число:")
    val num1 = readln().toInt()
    println("Введите второе число:")
    val num2 = readln().toInt()
    var a=num1
    var b=num2
    while (b != 0) {
        val t = b
        b = a % b
        a = t
    }
    println("НОД ($num1, $num2) = $a")
}
