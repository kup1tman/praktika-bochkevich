fun main() {
    println("Введите начальное число:")
    val n = readln().toInt()
    println("Введите шаг:")
    val step = readln().toInt()
    println("Числовая последовательность:")
    for (i in 0..10)
    {
        println(n + i * step)
    }
}
