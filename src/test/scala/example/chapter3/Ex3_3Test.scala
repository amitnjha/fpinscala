package example.chapter3
import example.chapter3.List._
import org.scalatest.{FlatSpec, Matchers}

class Ex3_3Test extends FlatSpec with Matchers {

  "setHead " should "return right list" in {

    setHead(List(2, 3, 4), 4) shouldBe (List(4, 3, 4))
  }

  "init " should "return right list" in {

    init(List(2, 3, 4)) shouldBe (List(2, 3))
  }

}
