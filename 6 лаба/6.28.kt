fun main() {
    println("Введите элементы массива, разделенные пробелами: ")
    val numbers = readLine()!!
    println("Введенный массив: ")
    for (number in numbers) {
        print("$number ")
    }
}