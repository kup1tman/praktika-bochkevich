fun sumOfFirstN(n: Int): Int {
    return (n * (n + 1)) / 2
}
fun main() {
    println("Введите число: ")
    val n= readln().toInt()
    val sum = sumOfFirstN(n)
    println(sum)
}