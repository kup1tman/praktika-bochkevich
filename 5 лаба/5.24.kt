fun main() {
    println("Исходная матрица:")
    val m1 = arrayOf(
        intArrayOf(1, 2, 3),
        intArrayOf(4, 5, 6),
        intArrayOf(7, 8, 9)
    )
    println(m1)
    val rows = m1.size
    val cols = m1[0].size
    val m2 = Array(cols) { IntArray(rows) }
    for (i in 0 until rows) {
        for (j in 0 until cols) {
            m2[j][i] = m1[i][j]
        }
    }
    println("Транспонированная матрица: ")
    println(m2)
}
