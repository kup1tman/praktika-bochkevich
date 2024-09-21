fun main() {
    println("Введите код ошибки:")
    val a= readln().toInt()
    when {
        a == 100 -> println("Ошибка сети")
        a == 200 -> println("Ошибка сервера")
        a == 300 -> println("Ошибка доступа")
        else ->println("Неизвестный код ошибки")
    }
}
