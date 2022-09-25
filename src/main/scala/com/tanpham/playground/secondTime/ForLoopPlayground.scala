package com.tanpham.playground.secondTime

object ForLoopPlayground extends App {
  val endLineSign = "\r\n"
  private val separator = endLineSign + "---------------"

  for (v <- 1 to 10) {
    print(s"${v}->") // 1 to 10
  }
  println(separator)

  for (v <- 1 until 10) {
    print(s"${v}->") // 1 to 9
  }
  println(separator)

  // Combine multiple loop in one for loop
  for (v <- 1 to 3; v2 <- 1 to 10) {
    print(s"${v} vs ${v2} ${endLineSign}")
  }
  println(separator)

  // For loop with collection
  val arr = Array(1, 2, 3, 4, 5)
  for (v <- arr) {
    print(s"${v}->")
  }
  println(separator)

  // For loop with multiple filter
  val arrayExample = Array(1,2,3,4,5,6)
  for (v <- arrayExample if v % 2 == 0; if v != 4) {
    print(s"${v}->")
  }
  println(separator)

  // For loop with yield
  private val yieldOutput: Array[String] = for (v <- arrayExample if v % 2 == 1) yield s"${v}"
  print(s"yieldOutput ${yieldOutput.mkString("")}")
  println(separator)

  println(separator)
  println(separator)
  println(separator)
  println(separator)

}
