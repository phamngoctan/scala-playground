package com.tanpham.playground.secondTime

object HighOrderFunctionDemo extends App {
  var doubleFunc = (i:Int) => i * 2
  def higherOrder(x:Int, y:Int => Int) = y(x)
  println(s"Demo higher order function, " +
    s"calling doubleFunc as a parameter ${higherOrder(3, doubleFunc)}")

  var tripleFunc = (i:Int) => i * 3
  println(s"Demo higher order function, " +
    s"calling tripleFunc as a parameter ${higherOrder(3, tripleFunc)}")
}
