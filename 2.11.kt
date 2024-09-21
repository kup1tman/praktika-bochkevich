fun main()
{
    val Y: Boolean = false
    val X: Boolean = false
    val Z: Boolean = true
    val c=X||Y&&!Z
    val d=X&&!Y||Z
    val f=!X&&!Y
    val g=X&&(!Y||Z)
    val h=!(X&&Z)||Y
    var j=X||(!(Y||Z))

    println("X или Y и не Z = $c")
    println("X и не Y или Z = $d")
    println("не X и не Y = $f")
    println("X и (не Y или Z) = $g")
    println("не(X и Z) или Y = $h")
    println("X или(не(Y или Z)) = $j")
}
