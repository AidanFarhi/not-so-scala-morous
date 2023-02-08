
// providing default values to parameters
case class Point(var x: Int = 0, var y: Int = 0)

@main def main = 
    val p1 = Point()     // (0, 0)
    val p2 = Point(1)    // (1, 0)
    val p3 = Point(1, 2) // (1, 2)
    val p4 = Point(y=4)  // (0, 4)
    println(p1)
    println(p2)
    println(p3)
    println(p4)
