fun main() {
    println("Введите год: ")
    val a = readln().toInt()

    if (a%4==0) {
        println("Год високосный. Дней 366")
    } else {
        println("Год не високосный")
    }
}
