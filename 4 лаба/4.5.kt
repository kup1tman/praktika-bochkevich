fun main() {
    println("Введите число:")
    val a = readln().toInt()
    when {
        a>0 -> println("Число положительное")
        a<0-> println("Число отрицательное")
        else-> println("Число ноль")
    }
}
