class Point:
    
    private var _x = 0
    private var _y = 0
    private val bound = 100

    def x: Int = _x
    def x_=(newValue: Int): Unit =
        if newValue < bound then
            _x = newValue
        else
            printWarning()

    def y: Int = _y
    def y_=(newValue: Int): Unit =
        if newValue < bound then
            _y = newValue
        else
            printWarning()

    private def printWarning(): Unit = 
        println("WARNING: Out of bounds")
end Point

class OtherPoint(var x: Int, var y: Int)

class YetAnotherPoint(val x: Int, val y: Int)

class AnotherPointWithPrivateFields(x: Int, y: Int)

@main def main =
    val point1 = Point()
    point1.x = 99
    point1.y = 101
    println(point1.x)
    println(point1.y)

    val point2 = OtherPoint(10, 20)
    point2.x = 100
    println(point2.x)

    val point3 = YetAnotherPoint(20, 30)
    println(point3.x)
    // point3.x = 10        <- this would not compile

    val point4 = AnotherPointWithPrivateFields(10, 20)
    // println(point4.x)    <- this would not compile
    // point3.x             <- this would not compile
