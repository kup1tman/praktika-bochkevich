fun main() {
    println("Введите число: ")
    val a= readln().toInt()
    var i=1
    var sum=0
    while(i<=a)
    {
    sum+=i
        i++
    }
    println("Сумма чисел от 1 до $a: $sum")
}
