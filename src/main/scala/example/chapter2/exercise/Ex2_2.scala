package example.chapter2.exercise

import scala.annotation.tailrec

object Ex2_2 {

  /* Exercise 2.2 Implement isSorted which checks whether an Array [A] is sorted or not  */

  def isSorted[A](as: Array[A], ordered: (A, A) => Boolean): Boolean = {

    def go(n: Int): Boolean =
      if (n == as.length - 1) {
        true
      } else if (ordered(as(n), as(n + 1)))
        go(n + 1)
      else
        false

    if (as.isEmpty)
      true
    else
      go(0)
  }
}
