object Basics {
    def main(args: Array[String]) : Unit = {

        // Expressions
        println(1)
        println(1 + 1)
        println("Hello")
        println("Hello" + " " + "World")

        // Values (these are basically constants)
        val x = 1 + 1
        // x = 3 <- this would not compile
        val y: Int = 2 + 3 
        println(x)
        println(y)

        // Variables
        var z = 5
        z = 10
        println(z * 20)
        var foo: Int = 99
        println(foo)

        // Blocks
        println({
            val x = 1 + 1
            x + 1
        })

        // Functions
        // (x: Int) => x + 1 // <- anonymous function
        val addOne = (x: Int) => x + 1
        println(addOne(10))
        val add = (x: Int, y: Int) => x + y
        println(add(10, 20))
        val noParams = () => 99
        println(noParams())

        // Methods
        def addNums(x: Int, y: Int): Int = x + y
        def addThenMultiply(x: Int, y: Int)(multiplier: Int): Int = (x + y) * multiplier
        def name: String = System.getProperty("user.name")
        def getSquareString(x: Double): String = 
            val square = x * x
            square.toString
        println(addNums(11, 22))
        println(addThenMultiply(10, 20)(3))
        println(name)
        println(getSquareString(5))
    }   
}