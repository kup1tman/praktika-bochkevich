fun trueSum( a: Int, b: Int):Boolean {
    return (a + b ) < 100
}
fun main() {
    print("Введите первое число: ")
    val a = readln().toInt()
    print("Введите второе число: ")
    val b = readln().toInt()
    print("${trueSum(a, b)}")
}