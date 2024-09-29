import kotlin.random.Random
fun main() {
    val numbers = IntArray(20)
    { Random.nextInt(1, 101) }
    print("Массив случайных чисел: ")
    for (number in numbers) {
        print("$number ")
    }
}