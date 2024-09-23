fun main() {
    while (true) {
        print("Введите первую цифру: ")
        val num1 = readln().toInt()
        print("Введите вторую цифру: ")
        val num2 = readln().toInt()
        print("Выберите + или *: ")
        val n= readLine()!!
        when (n) {
            "+" -> println("$num1 + $num2 = ${num1 + num2}")
            "*" -> println("$num1 * $num2 = ${num1 * num2}")
            "стоп" -> { println("Программа завершена.")
                break
            }
            else -> println("Неверная операция")
        }
    }
}
