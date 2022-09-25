package com.tanpham.playground.secondTime

object VarargsDemo extends App {
  // Varargs stands for variable length argument
  // indicate the last argument of the function.
  def sum(a: Int, b: Int, extendedArgs:Int *):Int = {
    var ans:Int = a + b
    for (arg <- extendedArgs) {
      ans += arg
    }
    ans
  }
  println(s"Demo sum function with varargs: ${sum(50,50,1,2,3,4,5)}")
}
