fun main() {
    val numbers = intArrayOf(1, 1, 5, 5, 7, 9, 5, 100)
    print("Уникальные элементы массива = ")
    for (i in numbers.indices) {
        var isUnique = true
        for (j in numbers.indices) {
            if (i != j && numbers[i] == numbers[j]) {
                isUnique = false
                break
            }
        }
        if (isUnique) {
            print("${numbers[i]} ")
        }
    }
}