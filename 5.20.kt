fun main() {
    println("Простые числа в диапазоне от 1 до 20:")
    for (i in 1..20) {
        var a = true
        if (i <= 1) {
            a = false
        } else {
            for (j in 2..Math.sqrt(i.toDouble()).toInt()) {
                if (i % j == 0)
                    a = false
            }
        }
        if (a) {
            println("$i ")
        }
    }
}
