fun main() {
    println("Введите строку:")
    val n = readLine().toString()
    val result = n.map {
        if (it.isUpperCase()) {
            it.lowercase()
        } else {
            it.uppercase()
        }
    }.joinToString("")
    println(result)
}