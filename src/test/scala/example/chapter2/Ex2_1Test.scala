package example.chapter2

import example.chapter2.exercise.Ex2_1
import org.scalatest._

class Ex2_1Test extends FlatSpec with Matchers {

  "Fib of 0" should " be 0" in {
    Ex2_1.fibonacci(0) shouldEqual 0
  }

  "Fib of 1" should " be 1" in {
    Ex2_1.fibonacci(1) shouldEqual 1
  }

  "Fib of 2" should " be 1" in {
    Ex2_1.fibonacci(2) shouldEqual 1
  }

  "Fib of 3" should " be 2" in {
    Ex2_1.fibonacci(3) shouldEqual 2
  }

  "Fib of 4" should " be 3" in {
    Ex2_1.fibonacci(4) shouldEqual 3
  }

  "Fib of 5" should " be 5" in {
    Ex2_1.fibonacci(5) shouldEqual 5
  }

  "Fib of 6" should " be 8" in {
    Ex2_1.fibonacci(6) shouldEqual 8
  }

}
