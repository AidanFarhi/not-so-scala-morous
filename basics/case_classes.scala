case class Point(x: Int, y: Int)

@main def main() = 
    val p1 = Point(10, 20)
    val p2 = Point(10, 23)
    val p3 = Point(3, 42)
    if p1 == p2 then
        println(s"$p1 and $p2 are the same")
    else
        println(s"$p1 and $p2 are the different")