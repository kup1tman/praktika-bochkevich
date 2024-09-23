fun main() {
    println("Введите расстояние в км: ")
    val a = readln().toDouble()
    println("Введите расстояние в футах: ")
    val b = readln().toDouble()
    val c=b*0.305
    if (a<c) {
        println("Расстояние в км меньше")
    } else if (a>c) {
        println("Расстояние в футах меньше")
    }
    else
        println("Расстояния равны")
}
