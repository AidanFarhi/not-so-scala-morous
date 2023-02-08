import scala.collection.mutable.ArrayBuffer

trait Pet:
    val name: String

class Cat(val name: String = null) extends Pet
class Dog(val name: String = null) extends Pet

@main def main =
    val noNameDog = Cat()
    val namedCat = Cat("Spike")
    val namedDog = Dog("Fang")
    val animals = ArrayBuffer.empty[Pet]
    animals.append(noNameDog)
    animals.append(namedCat)
    animals.append(namedDog)
    animals.foreach(p => println(p.name))
