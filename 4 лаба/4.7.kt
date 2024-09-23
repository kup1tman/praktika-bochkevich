fun main() {
    val strings = listOf("", "Короткая", "Это строка средняя", "Эта строка оооооооооооочччеееееень длинная")
    for (string in strings) {
        val a = when (string.length)
        {
            0 -> "Пустая строка"
            in 1..10 -> "Короткая строка"
            in 11..25 -> "Средняя строка"
            else -> "Длинная строка"
        }
        println("\"$string\" = $a")
    }
}
