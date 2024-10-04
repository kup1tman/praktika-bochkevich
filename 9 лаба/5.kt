fun main() {
    println("Введите число:")
    val n = readln().toInt()
    println("Простые числа до $n:")
    for (i in 2..n) {
        if (isPrime(i)) {
            print("$i ")
        }
    }
}
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