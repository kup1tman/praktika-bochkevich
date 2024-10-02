fun celsiusToFahrenheit(c: Double): Double {
    return (c * 9 / 5) + 32
}
fun main() {
    println("Введите температуру в Цельсии: ")
    val c = readln().toDouble()
    val f = celsiusToFahrenheit(c)
    println("$c градусов Цельсия равны $f градусов Фаренгейта")
}