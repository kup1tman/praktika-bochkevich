fun main() {
    print("Введите n: ")
    val n = readln().toInt()
    for (i in 1..n) {
        for (j in 1..i) {
            print("$j ")
        }
        println()
    }
}
