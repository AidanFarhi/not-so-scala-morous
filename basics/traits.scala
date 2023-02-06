trait Greeter:
    def greet(name: String): Unit =
        println("Hello, " + name + "!")

object DefaultGreeter extends Greeter

class CustomGreeter(prefix: String, postfix: String) extends Greeter:
    override def greet(name: String): Unit =
        println(prefix + name + postfix)

@main def main = 
    val name: String = "Bob"
    DefaultGreeter.greet(name)
    val customGreeter = CustomGreeter("What's up ", ". How are you?")
    customGreeter.greet(name)
