
@main def main = 
    val myFunc = (x: Int) => x + 4
    def myMethod(x: Int): Int = x * 10
    val list: List[Any] = List(
        "string",
        732,
        'c',
        true,
        () => "anonymous function",
        myFunc,
        myMethod
    )
    list.foreach(e => println(e))