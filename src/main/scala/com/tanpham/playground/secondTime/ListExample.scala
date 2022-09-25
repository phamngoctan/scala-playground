package com.tanpham.playground.secondTime

object ListExample extends App {
  val list1 = List(1,2,3)
  println(list1)
  val list2 = 1::2::3::Nil
  println(list2)
  val list3 = List.range(1,4)
  println(list3)
  val mergedList1List2 = list1:::list2
  println(mergedList1List2)

  var curSum = 0
  for (elem <- mergedList1List2) curSum += elem
  println("sum of mergedList1List2 is: " + curSum)

  def average(arr: Int*): Double = {
    var total = 0.0
    for (value <- arr) {
      total += value
    }
    total/arr.length
  }

  def minF(arr: Array[Int]):Int = {
    var minVal = arr(0)
    // Do it in java style way
    for (value <- arr) {
      if (value < minVal) {
        minVal = value
      }
    }
    // Shorter way
//    for (value <- arr) if (value < minVal) minVal = value
    minVal
  }

  def maxF(arr: Array[Int]):Int = {
    var maxVal = arr(0)
    for (v <- arr) if (v > maxVal) maxVal = v
    maxVal
  }

  val arr = Array(1, 5, 9, 100, 50)
  println(s"min in arr ${arr.mkString(",")} is: " + minF(arr))
  println(s"max in arr ${arr.mkString("->")} is: " + maxF(arr))
  // change the arr to varargs in Scala :_*
  println(s"average in arr (1,2,3) is: " + average(1,2,3,100))
}
