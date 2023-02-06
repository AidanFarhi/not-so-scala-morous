class Greeter(prefix: String, suffix: String):
    def greet(name: String): Unit =
        println(prefix + name + suffix)

@main def main =
    val greeter = Greeter("hello ", ". how are you?")
    greeter.greet("Bob")
