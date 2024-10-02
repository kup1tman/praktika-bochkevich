fun Prize( prob: Int, prize: Int, pay: Int):Boolean {
    return (prob * prize) > pay
}
fun main() {
    print("Введите первое число: ")
    val a = readln().toInt()
    print("Введите второе число: ")
    val b = readln().toInt()
    print("Введите третье число: ")
    val c = readln().toInt()
    print("${Prize(a, b, c)}")
}