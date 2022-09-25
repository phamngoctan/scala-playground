package com.tanpham.playground.secondTime

object Recursion extends App {
  def fac1(n:Int) = {
    var ans = 1
    for (i <- 1 to n) {
      ans *= i
    }
    ans
  }
  println(s"ans using factorial method 1 ${fac1(5)}")

  def fac2(n:Int):Int = {
    if (n == 1) 1 else n * fac2(n - 1)
  }
  println(s"ans using factorial method 2 ${fac2(5)}")

}
