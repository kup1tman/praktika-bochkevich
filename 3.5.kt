fun main() {
    println("Введите первое сторону треугольника:")
    val a = readln().toInt()
    println("Введите второую сторону треугольника:")
    val b = readln().toInt()
    println("Введите третью сторону треугольника:")
    val c = readln().toInt()

    if ((a+b>c) and (b+c>a) and (a+c>b) ) {
        println("Треугольник существует")
    } else {
        println("Треугольник не существует")
    }
}
