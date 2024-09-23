fun main()
{
    println("Введите трёхзначное число: ")
    val a = readln().toInt()
    if((99<a) and (a<1000)) {
        val j = a / 100
        val b = a / 100
        val c = a % 10
        val f = b + c + j
        val g = b * c * j
        println("число сотен = $j")
        println("число десятков = $b")
        println("число единиц = $c")
        println("сумма цифр = $f")
        println("произведение цифр = $g")
    }
    else {
    println("Вы ввели не трёхзначное число!")
    }
}
