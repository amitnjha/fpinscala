package example.chapter2.exercise

class Ex2_4 {
  def uncurry[A, B, C](f: A => B => C): (A, B) => C = (a, b) => f(a)(b)

}
