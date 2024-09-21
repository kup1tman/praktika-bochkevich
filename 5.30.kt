fun main() {
    print("Введите целое число: ")
    var num = readln().toInt()
    val binary = StringBuilder() //для двоичногопредставления
    while (num > 0) {
        val remainder = num % 2 //бит в 2представлении
        binary.append(remainder) //добаляет остаток в конец StringBuilder
        num /= 2 //переход к следующему биту
    }
    val result = binary.reverse().toString() //переворачивает строку и преобразует
    println("Двоичное представление: $result")
}
