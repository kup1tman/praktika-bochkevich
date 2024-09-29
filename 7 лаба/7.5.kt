fun areNumbersEqual(a: Int, b: Int): Boolean {
    return a == b
}
fun main() {
    println("Введите первое числo:")
    val a = readln().toInt()
    println("Введите второе числo:")
    val b = readln().toInt()
    if (areNumbersEqual(a, b))
        println("Числа равны")
    else println("Числа не равны")
}