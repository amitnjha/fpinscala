package example.chapter2.exercise

class Ex2_5 {

  def compose[A, B, C](f: B => C, g: A => B): A => C = a => f(g(a))

}
