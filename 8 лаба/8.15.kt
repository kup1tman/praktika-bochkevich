fun max(a: Int, b: Int): Int {
    if (a > b) {
        return a
    } else {
        return b
    }
}
fun main() {
    println("Введите первое число: ")
    val a = readln().toInt()
    println("Введите второе число: ")
    val b = readln().toInt()
    println("Большее из них: ${max(a, b)}")
}