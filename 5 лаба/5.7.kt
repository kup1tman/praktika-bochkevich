fun main() {
    println("Введите количество чисел Фибоначчи, которые вы хотите сгенерировать:")
    val n = readln().toInt()
    var a = 0
    var b = 1
    println("Первые $n чисел Фибоначчи:")
    for (i in 1..n) {
        println(a)
        val t = a
        a = b
        b = t + b
    }
}
