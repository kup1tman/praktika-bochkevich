fun main() {
    println("Введите двузначное число:")
    val a = readln().toInt()
    val f = a / 10
    val s = a % 10
        if (f > s) {
            println("Первая цифра ($f) больше второй ($s)")
        } else if (f < s) {
            println("Вторая цифра ($s) больше первой ($f)")
        } else {
            println("Цифры одинаковы: $f = $s")
        }
}
