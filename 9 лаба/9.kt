import kotlin.random.Random
fun Password(length: Int): String {
    val chars = "QWERTYUIOPasdfghjklzxcvbnm0123456789!?@#$%^&*()"
    return (1..length)
        .map { Random.nextInt(chars.length) }
        .map(chars::get)
        .joinToString("")
}
fun main() {
    println("Введите длину пароля:")
    val length = readln().toInt()
    val password = Password(length)
    println("Ваш пароль: $password")
}