fun main() {
    println("Введите строку:")
    val string = readLine()!!
    var String = ""
    for (i in string.length - 1 downTo 0) {
        String += string[i]
    }
    println("Строка в обратном порядке: $String")
}
