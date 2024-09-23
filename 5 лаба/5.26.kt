fun main() {
    print("Введите n: ")
    val n = readln().toInt()
    var a = 0
    var b = 0
    for (i in 1..n) {
        if (i % 2 == 0) {
            a += i
        } else {
            b += i
        }
    }
    println("Сумма четных чисел от 1 до $n: $a")
    println("Сумма нечетных чисел от 1 до $n: $b")
}
