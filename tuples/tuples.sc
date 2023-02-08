
@main def main =
    val ingredient = ("Sugar", 25)
    println(ingredient(0))
    println(ingredient(1))

    val (name, quantity) = ingredient
    println(name)
    println(quantity)
    