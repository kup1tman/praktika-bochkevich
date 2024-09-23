fun main() {
    println("Введите вашу оценку")
    val a = readln().toInt()
    when(a) {
        2 -> println("Неудовлетворительно")
        3-> println("Удовлетворительно")
        4-> println("Хорошо")
        5-> println("Отлично")
        else -> println("Недопустимая оценка")
    }
}
