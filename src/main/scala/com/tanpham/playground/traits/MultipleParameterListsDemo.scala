package com.tanpham.playground.traits

object MultipleParameterListsDemo extends App {

  // demo foldLeft function
  val numbers = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
  val res = numbers.foldLeft(0)((m, n) => {
    println(s"${m} vs ${n}")
    m + n
  })
  println(res)
  assert(res == 55)

  // Derive type inference
   def foldLeft1[A, B](as: List[A], b0: B, op: (B, A) => B) = ???
   def firstWay = foldLeft1[Int, Int](numbers, 0, _ + _)
   def secondWay = foldLeft1(numbers, 0, (a: Int, b: Int) => a + b)

  // Partial application
  // When a method is called with a fewer number of parameter lists,
  // then this will yield a function taking the missing parameter lists as its arguments
  val numberFunc = numbers.foldLeft(List[Int]()) _

  val squares = numberFunc((xs, x) => xs :+ x*x)
  println(squares) // List(1, 4, 9, 16, 25, 36, 49, 64, 81, 100)

  val cubes = numberFunc((xs, x) => xs :+ x*x*x)
  println(cubes)  // List(1, 8, 27, 64, 125, 216, 343, 512, 729, 1000)

}
