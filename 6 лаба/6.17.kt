fun main() {
    val numbers = intArrayOf(1, 2, 3, 4, 5)
    var sum = 0
    var proz = 1
    for (number in numbers) {
        sum += number
        proz *= number
    }
    println("Сумма элементов массива: $sum")
    println("Произведение элементов массива: $proz")
}