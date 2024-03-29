package example.chapter3

import java.util.NoSuchElementException

sealed trait List[+A]
case object Nil extends List[Nothing]
case class Cons[+A](head: A, tail: List[A]) extends List[A]

object List {
  def sum(ints: List[Int]): Int = ints match {
    case Nil         => 0
    case Cons(x, xs) => x + sum(xs)
  }

  def product(ds: List[Double]): Double = ds match {
    case Nil          => 1.0
    case Cons(0.0, _) => 0.0
    case Cons(x, xs)  => x * product(xs)
  }

  def apply[A](as: A*): List[A] =
    if (as.isEmpty) Nil
    else
      Cons(as.head, apply(as.tail: _*))

  def tail[A](list: List[A]): List[A] = list match {
    case Nil         => throw new NoSuchElementException("tail of empty list")
    case Cons(x, xs) => xs
  }

  def setHead[A](list: List[A], headElem: A): List[A] = list match {
    case Nil         => List(headElem)
    case Cons(h, xs) => Cons(headElem, xs)
  }

  def drop[A](list: List[A], n: Int): List[A] = {
    if (n <= 0) list
    list match {
      case Nil        => Nil
      case Cons(_, t) => drop(t, n - 1)
    }
  }

  def dropWhile[A](list: List[A], f: A => Boolean): List[A] = {
    list match {
      case Cons(a, t) if f(a) => dropWhile(t, f)
      case _                  => list
    }
  }

  def init[A](list: List[A]): List[A] = {
    list match {
      case Nil              => Nil
      case Cons(head, Nil)  => Nil
      case Cons(head, tail) => Cons(head, init(tail))
    }
  }
}
