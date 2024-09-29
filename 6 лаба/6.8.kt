fun main() {
    val numbers= arrayOf(1, 2, 3, 4, 5)
    print("Введите элемент массива: ")
    val a = readln().toInt()
    for (i in numbers.indices) {
        if (numbers[i] == a) {
            println("Индекс элемента: $i")
            return
        }
    }
    println("Такого элемента нет")
}
