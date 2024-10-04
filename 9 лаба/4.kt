fun main() {
    println("Введите первую строку:")
    val str1 = readLine()!!
    println("Введите вторую строку:")
    val str2 = readLine()!!
    if (str1.length != str2.length)
        println("Строки не являются анаграммами")
    else
        println("Строки являются анаграммами")
}