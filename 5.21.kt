fun main() {
    print("Введите год: ")
    val year = readln().toInt()
    print("Введите месяц: ")
    val month = readln().toInt()
    println("Даты в $month месяце $year года:")
    for (day in 1..31) {
        println("$day.$month.$year")
    }
}
