fun sum(a: Int, b: Int): Int {
    return a + b
}
fun main() {
    println("Введите первое число: ")
    val a = readln().toInt()
    println("Введите второе число: ")
    val b = readln().toInt()
    println("Сумма: ${sum(a, b)}")
}