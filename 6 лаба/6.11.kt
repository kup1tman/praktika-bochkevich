fun main() {
    val a1 = intArrayOf(1, 2, 3, 4, 5)
    val a2 = intArrayOf(3, 5, 7, 4, 10)
    println("Пересечение массивов:")
    for (i in a1.indices) {
        for (j in a2.indices) {
            if (a1[i] == a2[j]) {
                print("${a1[i]} ")
                break
            }
        }
    }
}