fun main() {
    println("Введите число m : ")
    val m = readln().toInt()
    println("Введите число n : ")
    val n = readln().toInt()
    if (m%n==0) {
        val c=m/n
        println("$m на $n нацело делится. Остаток от деления = $c")
    }
    else
        println("$m на $n нацело не делится")
}
