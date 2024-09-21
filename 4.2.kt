fun main() {
    println("Введите 1 сторону треугольника")
    val a = readln().toInt()
    println("Введите 2 сторону треугольника")
    val b= readln().toInt()
    println("Введите 3 сторону треугольника")
    val c = readln().toInt()
    when {
        a == b && b == c -> println("Равносторонний треугольник")
        a == b || b == c || a == c -> println("Равнобедренный треугольник")
        else -> println("Разносторонний треугольник")
    }
}
