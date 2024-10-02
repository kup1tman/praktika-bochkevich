fun isPrime(number: Int): Boolean {
    if (number <= 1) {
        return false
    }
    for (i in 2..Math.sqrt(number.toDouble()).toInt()) {
        if (number % i == 0) {
            return false
        }
    }
    return true
}
fun main() {
    println("Введите число: ")
    val a = readln().toInt()
    println(isPrime(a))
}