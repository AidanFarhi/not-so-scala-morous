// You can think of objects as singletons
object IdFactory:
    private var counter = 0
    def create(): Int =
        counter += 1
        counter

@main def main = 
    val id1 = IdFactory.create()
    val id2 = IdFactory.create()
    println(id1)
    println(id2)
