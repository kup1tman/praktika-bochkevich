fun trueDel( a: Int):Boolean {
    return a % 100==0
}
fun main() {
    print("Введите число: ")
    val a = readln().toInt()
    print("${trueDel(a)}")
}