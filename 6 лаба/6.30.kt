fun main() {
    val numbers = IntArray(100) { it + 1 }
    println("Группы:")
    for (i in 0..9) {
        print("Группа ${i + 1}: ")
        for (j in i * 10 until (i + 1) * 10) {
            print("${numbers[j]} ")
        }
        println()
    }
}