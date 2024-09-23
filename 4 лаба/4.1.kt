fun main() {
    println("Введите день недели:")
    val a = readln().toInt()
    when(a) {
        1 -> println("Понедельник")
        2 -> println("Вторник")
        3 -> println("Среда")
        4 -> println("Четверг")
        5 -> println("Пятница")
        6 -> println("Суббота")
        7 -> println("Воскресенье")
        else-> println("Некорректный день")
    }
}
