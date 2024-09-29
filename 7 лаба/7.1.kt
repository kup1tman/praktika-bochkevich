fun main() {
    println("Калькулятор. Введите первое число: ")
    val number1 = readLine()!!.toDouble()
    println("Введите второе число: ")
    val number2 = readLine()!!.toDouble()
    println("Выберите арифметическую операцию, где 1 = +, 2 = -, 3 = *, 4 = /, 5 = %: ")
    val operation = readln().toInt()
    when (operation) {
        1 -> println("$number1 + $number2 = ${number1 + number2}")
        2 -> println("$number1 - $number2 = ${number1 - number2}")
        3 -> println("$number1 * $number2 = ${number1 * number2}")
        4 -> {
            if (number2 == 0.0) {
                println("Деление на ноль невозможно")
            } else {
                println("$number1 / $number2 = ${String.format("%.2f", number1 / number2)}") 
            }
        }
        5 -> println("$number1 % $number2 = ${number1 % number2}")
        else -> println("Неподдерживаемый оператор")
    }
}