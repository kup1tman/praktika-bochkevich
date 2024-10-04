fun main() {
    println("Введите сумму в долларах:")
    val dollars = readln().toInt()
    println("Введите курс доллара к евро:")
    val euros = readln().toInt()
    val n = dollars * euros
    println("$dollars долларов равны $n евро.")
}
