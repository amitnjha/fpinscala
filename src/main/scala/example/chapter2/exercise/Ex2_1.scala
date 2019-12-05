package example.chapter2.exercise

object Ex2_1 {

  def fibonacci(n: Int): Int = {

    @annotation.tailrec
    def go(n: Int, prev1: Int, prev2: Int): Int = {
      if (n <= 0)
        prev1 + prev2
      else
        go(n - 1, prev2, prev2 + prev1)
    }

    if (n < 0) {
      -1
    } else if (n == 0 || n == 1)
      n
    else go(n - 2, 0, 1)
  }

  def main(args: Array[String]): Unit = {
    println(fibonacci(5))
  }
}
