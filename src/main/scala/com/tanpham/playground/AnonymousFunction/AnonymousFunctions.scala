package com.tanpham.playground.AnonymousFunction

object AnonymousFunctions extends App {
  // anonymous function Lambda
  val doubler = (x: Int) => x * 2 // auto understand the below code
  val doubler2: Int => Int = (x: Int) => x * 2 // remember behind the doubler2 should be an comma, not an equal, OK?

  // multiple param
  val adder = (v1: Int, v2: Int) => v1 + v2
  val adder2: (Int, Int) => Int = (v1: Int, v2: Int) => v1 + v2

  // no params
  val justDoSomething = () => println("Hello world")

  // with curly braces wrapping around the Lambda function
  val stringToInt = {
    (strValue: String) => {
      strValue.toInt
    }
  }

  // MOAR syntactic sugar || COOL || GOOD to know
  val niceIncrement = (x: Int) => x + 1
  val niceIncrement2: Int => Int = (x: Int) => x + 1
  val niceIncrementAppliedMoarSyntacticSugar: Int => Int = _ + 1
  assert(niceIncrementAppliedMoarSyntacticSugar(1) == 2)

  val niceAdder = (x: Int, y: Int) => x + y
  val niceAdder2: (Int, Int) => Int = (x: Int, y: Int) => x + y
  var niceAdderAppliedMoarSyntacticSugar: (Int, Int) => Int = _ + _
  assert(niceAdderAppliedMoarSyntacticSugar(1, 2) == 3)

}
