fun googleWithOs(number: Int): String {
    if (number < 1) {
        return "Google"
    }
    return "G" + "o".repeat(number) + "gle"
}

fun main() {
    println(googleWithOs(3))
}