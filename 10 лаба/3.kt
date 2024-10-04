fun main() {
    val a = "qwertyuioplkjhgfdsazxcvbnm"
    println("Введите сдвиг: ")
    val n = readln().toInt()
    println("Введите текст для шифрования: ")
    val s = readln().trim()
    var res = ""
    for (c in s) {
        val index = a.indexOf(c)
        res += a[(index + n) % a.length]
    }
    println("Результат: $res")
}