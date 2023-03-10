
trait Iterator[A]:
    def hasNext: Boolean
    def next(): A

class IntIterator(to: Int) extends Iterator[Int]:
    private var current = 0
    override def hasNext: Boolean = current < to
    override def next(): Int =
        if hasNext then
            val t = current
            current += 1
            t
        else
            0

@main def main =
    val iterator = IntIterator(10)
    while (iterator.hasNext)
        println(iterator.next())