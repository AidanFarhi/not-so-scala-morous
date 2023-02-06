class Greeter(prefix: String, suffix: String):
    def greet(name: String): Unit =
        println(prefix + name + suffix)

object MoreBasics {
    def main(args: Array[String]): Unit = {
        val gr1 = Greeter("Hello ", ". How are you?")
        gr1.greet("Bob")
    }
}