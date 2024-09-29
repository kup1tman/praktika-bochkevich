fun main() {
    val numbers= arrayOf(1, 2, 3, 4, 5, 8)
    var sum=0
    for (i in numbers) {
        if(i % 2 == 0)
        sum+=i
    }
    println("Сумма четных элементов в массиве = $sum")
