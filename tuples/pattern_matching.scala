
@main def main =
    val planets = List(
            ("Mercury", 57.9), ("Venus", 108.2), ("Earth", 149.6),
            ("Mars", 227.9), ("Jupiter", 778.3), ("Pluto", 1243.4)
        )
    planets.foreach {
        case ("Earth", distance) =>
            println(s"Our planet is $distance million kilometers from the sun")
        case _ =>
    }
    