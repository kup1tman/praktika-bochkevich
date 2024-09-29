fun main() {
    val arithmeticProgression = IntArray(5) { 2 + it * 3 }
    print("Арифметическая прогрессия:")
    for (number in arithmeticProgression) {
        print("$number ")
    }
}