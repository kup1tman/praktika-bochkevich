fun main() {
    println("Введите число:")
    val n = readln().toInt()
    var sum = 0
    var temp = n
    while (temp > 0) {
        sum += temp % 10 
        temp /= 10     
}
    println("Сумма цифр числа $n = $sum")
}
