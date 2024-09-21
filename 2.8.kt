fun main()
{
    val A: Boolean = true
    val B: Boolean = false
    val C: Boolean = false
    val c=!A||B
    val d=A&&!B
    val f=A&&B||C
    println("не A или B = $c")
    println("A и не B = $d")
    println("А и B или C = $f")

}
