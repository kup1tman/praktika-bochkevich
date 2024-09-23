fun main() {
    print("Введите количество чисел (N): ")
    val n = readln().toInt()
    val numbers = IntArray(n)
    println("Введите $n чисел:")
    for (i in 0 until n) {
        numbers[i] = readln().toInt()
    }
    numbers.sort() 
    for (number in numbers) {
        print("$number ")
    }
}
