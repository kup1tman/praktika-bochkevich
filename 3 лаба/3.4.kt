fun main() {
    println("Введите первое число (большее):")
    val f = readln().toInt()
    println("Введите второе число (меньшее):")
    val s = readln().toInt()
    if (f % s == 0) {
        println("$f кратно $s")
    } else {
        val r = f % s
        println("$f не кратно $s, остаток от деления: $r")
    }
}
