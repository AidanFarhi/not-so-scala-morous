abstract class AbsIterator:
    type T
    def hasNext: Boolean
    def next(): T

class StringIterator(s: String) extends AbsIterator:
    type T = Char
    private var i = 0
    def hasNext: Boolean = i < s.length
    def next() = 
        val ch = s charAt i
        i += 1
        ch

trait RichIterator extends AbsIterator:
    def foreach(f: T => Unit): Unit = while hasNext do f(next())

class RichStringIter extends StringIterator("Scala"), RichIterator

@main def main =
    val richStringIter = RichStringIter()
    richStringIter.foreach(println)
