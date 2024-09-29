fun main() {
    println("Введите количество побед:")
    val wins = readln().toInt()
    println("Введите количество ничьих:")
    val draws = readln().toInt()
    println("Введите количество поражений:")
    val losses = readln().toInt()
    val points = Points(wins, draws, losses)
    println("Количество очков: $points")
}
fun Points(wins: Int, draws: Int, losses: Int): Int {
    return wins * 3 + draws + 0
}