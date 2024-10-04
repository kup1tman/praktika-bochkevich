fun fizBuzz(n: Int): List<String> {
    return (1..n).map { number ->
        when {
            number % 3 == 0 && number % 5 == 0 -> "ВизллБизлл"
            number % 3 == 0 -> "Физллл"
            number % 5 == 0 -> "Бизлллл"
            else -> number.toString()
        }
    }
}
fun main() {
    print("Введите число: ")
    val n = readln().toInt()
    println(fizBuzz(n))
}