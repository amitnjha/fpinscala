package example.chapter2

//one line comment
/* Another comment */
/** Documentation comment */
object MyModule {

  def abs(n: Int): Int =
    if (n < 0) -n
    else n

  private def formatResult(str: String, x: Int, f: Int => Int): String = {
    str.format(x, f(x))
  }
  def factotial(n: Int): Int = {
    @annotation.tailrec
    def go(n: Int, acc: Int): Int =
      if (n <= 0) acc
      else go(n - 1, n * acc)
    go(n, 1)
  }
  def main(args: Array[String]): Unit = {
    println(formatResult("the abs of %d is %d", -42, abs))
    println(formatResult("the factorial of %d is %d", 7, factotial))
  }
}
