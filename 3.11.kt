fun main() {
    println("Введите число a : ")
    val a = readln().toInt()
    if (a%2==0) {
        println("Число $a чётное")
    }
    else
        println("Число $a не четное")
    if (a%10==7)
        println("Число оканчивается на 7")
    else
        println("Число не оканчивается на 7")
}
