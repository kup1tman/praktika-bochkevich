fun sumNumbers(): Int {
    println("Введите числа, разделенные пробелом:")
    val input = readln()
    val numbers = input.split(" ").map { it.toInt() }
    var sum=0
    for (number in numbers){
        sum += number}
    return sum
}
fun main() {
    print("Сумма всех элементов: ${sumNumbers()}")
}