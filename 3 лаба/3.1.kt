fun main()
{
    println("Введите число: ")
    var a= readln().toDouble()
    println("Введите число: ")
    var b= readln().toDouble()
    println("Введите число: ")
    var c= readln().toDouble()
    var max:Double
    if((a>b)and(a>c))
        max=a
    else if ((b>a)and(b>c))
        max=c
    else
        max=c
    println("max=$max")
}
