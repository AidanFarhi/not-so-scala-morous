class User

class Point(var x: Int, var y: Int):

    def move(dx: Int, dy: Int): Unit =
        x = x + dx
        y = y + dy

    override def toString(): String = 
        s"($x, $y)"

end Point

@main def main =
    val user1 = User()
    val p1 = Point(2, 3)
    p1.move(1, 1)
    println(p1)