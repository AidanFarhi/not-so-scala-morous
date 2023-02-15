
@main def main =

    val salaries = Seq(20_000, 70_000, 40_000)
    val doubleSalary = (x: Int) => x * 2
    val newSalaries = salaries.map(doubleSalary)
    println(newSalaries)

    // anonymous version
    val updatedSalaries = newSalaries.map(x => x * 2)
    println(updatedSalaries)

    // an even more concise version
    val moreSalaries = updatedSalaries.map(_ * 2)
    println(moreSalaries)
