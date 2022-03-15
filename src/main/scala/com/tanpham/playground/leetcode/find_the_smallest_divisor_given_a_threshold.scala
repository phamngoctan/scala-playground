package com.tanpham.playground.leetcode

object find_the_smallest_divisor_given_a_threshold extends App {
  println(s"${scala.math.ceil(4.0 / 5)}")
  println(s"${scala.math.ceil(5 / 5).toInt}")
  println(s"${scala.math.ceil(6 / 5).toInt}")

//  object Solution {
//    def smallestDivisor(nums: Array[Int], threshold: Int): Int = {
//      def isInThreshold(nums: Array[Int], threshold: Int, divisor: Float): Boolean = {
//        var total: Int = 0
//        for (num <- nums) {
//          total += scala.math.ceil(num.toFloat / divisor).toInt
//          // println(s"${total}")
//        }
//        // println(s"total ${total}")
//        total <= threshold
//      }
//      var left = 1
//      var right = nums.max
//      while (left < right) {
//        val mid = (left + (right - left) / 2).toFloat
//        // println(s"divisor ${mid}")
//        if (isInThreshold(nums, threshold, mid)) {
//          right = mid.toInt
//        } else {
//          left = mid.toInt + 1
//        }
//      }
//      return left
//    }
//  }
}
