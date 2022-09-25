package com.tanpham.playground.secondTime

object ArrayExample extends App {

  var arr = Array(1,2,3,4,5)
  for(num <- arr) {
    println(num)
  }

  println("Second approach to print arr")
  for (num <- arr) println(num)

  println("Only print the even number")
  for (num <- arr if num % 2 == 0) {
    println(num)
  }

  println("Another way to collect the even numbers")
  private val evenNums: Array[Int] = for (num <- arr if num % 2 == 0) yield num
  println(evenNums.mkString(","))

  var numArr = Array(1,2,3,4,5)
  def avg(nums: Array[Int]): Double = {
    var total = 0
    for (num <- nums)
    yield total += num
    total.toDouble/nums.length
  }
  println(s"average of numArr is: ${avg(numArr)}")

  def min = (nums: Array[Int]) => {
    var minVal = nums(0)
    for (num <- nums) if (num < minVal) minVal = num
    minVal
  }
  println(s"min value of numArr is: ${min(numArr)}")

}
