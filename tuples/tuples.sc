
@main def main =
    val ingredient = ("Sugar", 25)
    println(ingredient(0))
    println(ingredient(1))

    val (name, quantity) = ingredient
    println(name)
    println(quantity)

    val employee = ("Bob", 50_000)
    val (empl_name, salary) = employee
    println(empl_name)
    println(salary)

    val numPairs = List((2, 5), (3, -7), (20, 56))
    for (a, b) <- numPairs do
        println(a * b)
