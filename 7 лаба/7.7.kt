import kotlin.random.Random
fun main() {
    println("Игра в 21")
    var count = 0
    val koloda = mutableListOf(
        2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10, 11,
        2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10, 11,
        2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10, 11,
        2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10, 11
    )
    koloda.shuffle()
    while (true) {
        print("Будете брать карту? y/n\n")
        val choice = readLine()?.toLowerCase() ?: ""

        if (choice == "y") {
            val current = koloda.removeAt(0)
            println("Вам попалась карта достоинством $current")
            count += current
            if (count > 21) {
                println("Вы проиграли")
                break
            } else if (count == 21) {
                println("Вы набрали 21")
                break
            } else {
                println("У вас $count очков")
            }
        } else if (choice == "n") {
            println("У вас $count очков и вы закончили игру.")
            break
        } else {
            println("Неверный выбор")
        }
    }
}