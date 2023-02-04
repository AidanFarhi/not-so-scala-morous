object Basics {
    def main(args: Array[String]) : Unit = {
        // Expressions
        println(1)
        println(1 + 1)
        println("Hello")
        println("Hello" + " " + "World")

        // Values (you cannot reassign a val)
        val x = 1 + 1
        // x = 3 <- this would not compile
        val y: Int = 2 + 3 
        println(x)
        println(y)

        // Variables
        var z = 5
        z = 10
        println(z * 20)
    }
}