fun main() {
    val numbers = intArrayOf(1, 2, 3, 4, 5)
    var found = false
    for (number in numbers) {
        if (number == 6) {
            found = true
            break
        }
    }
    if (found) {
        println("Элемент 6 найден в массиве.")
    } else {
        println("Элемент 6 не найден в массиве.")
    }
}