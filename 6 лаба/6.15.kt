fun main() {
    val numbers = intArrayOf(1, 2, 3, 2, 1)
    if (isPalindrome(numbers)) {
        println("Массив является палиндромом.")
    } else {
        println("Массив не является палиндромом.")
    }
}
fun isPalindrome(numbers: IntArray): Boolean {
    val n = numbers.size
    for (i in 0 until n / 2) {
        if (numbers[i] != numbers[n - i - 1]) {
            return false
        }
    }
    return true
}