fun Stepen( k: Int, n: Int ):Boolean {
    return Math.pow(k.toDouble(), k.toDouble()).toInt() == n
}
fun main() {
    print("Введите первое число: ")
    val k = readln().toInt()
    print("Введите второе число: ")
    val n = readln().toInt()
    print("${Stepen(k, n)}")
}