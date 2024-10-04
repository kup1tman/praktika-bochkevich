fun main() {
    println("Введите число на выбор от 1 до 5:")
    val a = readln().toInt()
    when(a) {
        1 -> println("Не угадал :(")
        2 -> println("Не угадал :(")
        3 -> println("Угадал!")
        4 -> println("Не угадал :(")
        5 -> println("Не угадал :(")
        else-> println("Числа нет в диапозоне")
    }
}
