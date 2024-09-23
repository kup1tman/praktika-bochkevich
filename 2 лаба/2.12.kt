fun main()
{
    val A: Boolean = true
    val B: Boolean = false
    val C: Boolean = false
    val c=A||!(A&&B)||C
    val d=!A||A&&(B||C)
    val f=(A||B&&!C)&&C
    println("A||!(A&&B)||C = $c")
    println("!A||A&&(B||C) = $d")
    println("(A||B&&!C)&&C = $f")
}
