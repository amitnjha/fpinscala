package example.chapter3
import example.chapter3.List._

import org.scalatest.{FlatSpec, Matchers}

class Ex3_2Test extends FlatSpec with Matchers {

  "tail list " should "return right tail" in {

    tail(List(2, 3, 4)) shouldBe (List(3, 4))
  }

  "tail list  of empty" should "throw exception" in {
    intercept[NoSuchElementException] {
      tail(Nil)
    }
    //tail(Nil) shouldBe (new NoSuchElementException("tail of empty list"))
  }

}
