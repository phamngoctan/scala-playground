package com.tanpham.playground.secondTime

object Playground extends App {
  var name = "Tan"
  println("Hello " + name)

  var aList = List[Int] (1,2,3,4,5)
  aList = 0 :: aList
  println(aList)

//  var aList2 = List(1,2,3,4,5)
//  println(aList2)

  var aMap = Map[String, String](
    "key1" -> "val1",
    "key2" -> "val2"
  )
  println(aMap)

  // Add one new item to the list
  var immutableList = List[Int](1, 2, 3, 4)
  immutableList = 0 :: immutableList
  println("Immutable list " + immutableList)

  // Append one new item to the list
  var immutableList2 = immutableList ::: List(8,9)
  println("Immutable list (append last) " + immutableList2)

  def demoFunction(aNumber: Int): Int = {
    aNumber + 1
  }
  println("demo function output: " + demoFunction(1))

  def demoFunc2(a:Int, b:Int) = {
    a + b
  }
  println(s"demoFunc2: ${demoFunc2(1, 2)}")

  def demoFunc3(a:Number, b:Number):Number = a.intValue() + b.intValue()
  println(s"demoFunc3: ${demoFunc3(1, 2)}")

}
