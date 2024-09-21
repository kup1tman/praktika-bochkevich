fun main()
{
    val Y: Boolean = true
    val X: Boolean = true
    val Z: Boolean = false
    val c=!X&&Y
    val d=X||!Y
    val f=X||Y&&Z
    println("не X и Y = $c")
    println("X или !Y = $d")
    println("X или Y и Z = $f")
}
