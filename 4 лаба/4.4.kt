fun main() {
    println("Введите час дня:")
    val a = readln().toInt()
    when(a) {
        in 0..4 -> println("Ночь")
        in 5..11-> println("Утро")
        in 12..16 -> println("День")
        in 17..23-> println("Вечер")
        else -> println("Недопустимый час")
    }
}
