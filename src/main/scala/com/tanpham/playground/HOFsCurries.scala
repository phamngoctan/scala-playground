package com.tanpham.playground

object HOFsCurries extends App {

  // HOFs for High Order Functions
  var superFunction: (Int, (String, (Int => Boolean)) => Int) => (Int, Int) = null //???
  // more example: map, flatMap, filter in MyList

  // function that applies a function n times over a value x
  // nTimes(funcNamedF, n, x) reading it: apply funcNamedF n times for value x
  // nTimes(funcNamedF, 3, x) = f(f(f(x))) = nTimes(funcNamedF, 2, f(x))
  // Recursion
  def nTimes(funcF: Int => Int, n: Int, x: Int): Int = {
    if (n <= 0)
      x
    else
      nTimes(funcF, n - 1, funcF(x))
  }

  val plusOneFunc = (x: Int) => x + 1
  assert(nTimes(plusOneFunc, 10, 0) == 10) // reading it: call plusOneFunc 10 times for starting value is 0

  // let's go into another terminology :)
  // Don't be rush babe, you will like it.
  // nTimesBetter(funcF, n) = x => funcF(FuncF(FuncF....(x))) // how many times we apply
  def nTimesBetter(funcF: Int => Int, n: Int): (Int => Int) = {
    // TODO: fix me

  }

}
