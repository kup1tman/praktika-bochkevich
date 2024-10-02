fun repeatString(txt: String, n: Int): String {
    if (n == 1) {
        return txt
    } else {
        return txt + repeatString(txt, n - 1)
    }
}
fun main() {
    val repeatedString = repeatString("Котлин ", 5)
    println(repeatedString)
}