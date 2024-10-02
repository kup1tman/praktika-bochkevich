fun combineNumbers(): List<Int> {
    println("Введите первый спискок, разделенные пробелом:")
    val input1 = readln()
    println("Введите второй список, разделенные пробелом:")
    val input2 = readln()
    val numbers1 = input1.split(" ").map { it.toInt() }
    val numbers2 = input2.split(" ").map { it.toInt() }
    return numbers1+numbers2
}

fun main() {
    val a = combineNumbers()
    print("Список двух объединённых чисел: $a")
}