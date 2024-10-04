fun piramid(n: Int): List<String> {
    val pyramid = mutableListOf<String>()
    for (i in 0 until n) {
        val spaces = " ".repeat(n - i - 1)
        val hashes = "#".repeat(2 * i + 1)
        pyramid.add("$spaces$hashes$spaces") 
    }
    return pyramid
}
fun main() {
    println("Введите сколько уровней будет в пирамиде : ")
    val n = readln().toInt()
    val pyramid=piramid(n)
    for (i in pyramid) {
        println(i)
    }
}