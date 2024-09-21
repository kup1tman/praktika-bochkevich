fun main() {
    println("Введите четырехзначное число:")
    val a = readln().toInt()
    val first = a / 1000 // первая цифра
    val second= (a / 100) % 10 // вторая цифра
    val third = (a / 10) % 10 // третья цифра
    val fourth = a % 10 // четвертая цифра

    val sumFirstTwo = first + second
    val sumLastTwo = third + fourth
    if (sumFirstTwo==sumLastTwo)
        println("Сумма двух первых цифр равна сумме двух последних")
    else
        println("Сумма двух первых цифр не равна сумме двух последних")

    val Sum = first + second + third + fourth
    if (Sum % 3==0)
        println("Сумма цифр кратна трем")
    else
        println("Сумма цифр не кратна трем")

    val Proiz = first * second * third * fourth
    if (Proiz % 4 == 0)
        println("Произведение цифр кратно четырем")
    else
        println("Произведение цифр не кратно четырем")

    println("Введите число a для проверки кратности произведения цифр:")
        val b = readln().toInt()
        if (Proiz % b == 0 )
        {
            println("Произведение цифр кратно числу $b")
        } else {
            println("Произведение цифр не кратно числу $b")
        }
}
