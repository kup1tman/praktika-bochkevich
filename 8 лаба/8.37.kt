fun Table(number: Int) {
    for (i in 1..10) {
        println("$number * $i = ${number * i}")
    }
}
fun main() {
    println("Введите число: ")
    val n= readln().toInt()
    Table(n)
}
