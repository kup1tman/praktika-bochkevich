fun main()
{
    println("Введите двузначное число: ")
    val a = readln().toInt()
    if((9<a) and (a<100)) {
        val b = a / 10
        val c = a % 10
        val f = b + c
        val g = b * c
        println("число десятков = $b")
        println("число единиц = $c")
        println("сумма цифр = $f")
        println("произведение цифр = $g")
    }
    else {
    println("Вы ввели не двузначное число!")
    }
}
