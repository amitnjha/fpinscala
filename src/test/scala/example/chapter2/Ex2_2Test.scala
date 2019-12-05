package example.chapter2

import example.chapter2.exercise.Ex2_2
import org.scalatest.{FlatSpec, Matchers}

class Ex2_2Test extends FlatSpec with Matchers {
  "isSorted of sorted" should "be true" in {

    Ex2_2
      .isSorted[Int](Array(2, 3, 4), (a: Int, b: Int) => a < b) shouldEqual true
  }

  "isSorted of non sorted" should "be false" in {

    Ex2_2
      .isSorted[Int](Array(2, 3, 4, 1, 2, 3), (a: Int, b: Int) => a < b) shouldEqual false
  }

  "isSorted of empty" should "be true" in {

    Ex2_2
      .isSorted[Int](Array(), (a: Int, b: Int) => a < b) shouldEqual true
  }

  "isSorted of sorted String" should "be true" in {

    Ex2_2
      .isSorted[String](Array("a", "b", "c"), (a: String, b: String) => a < b) shouldEqual true
  }

  "isSorted of sorted String when duplicate" should "be true" in {

    Ex2_2
      .isSorted[String](Array("a", "a", "c"), (a: String, b: String) => a <= b) shouldEqual true
  }
}
