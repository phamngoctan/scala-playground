package com.tanpham.playground.leetcode

object minimum_number_of_days_to_make_m_bouquets {
  object Solution {
    def minDays(bloomDay: Array[Int], m: Int, k: Int): Int = {
      if (m * k > bloomDay.size) return -1
      def canFormAllBouquets(bloomDay: Array[Int], m: Int, k: Int, days: Int): Boolean = {
        var canFormNumberOfBouquets = 0
        var curNumberOfFlower = 0
        for (bloom <- bloomDay) {
          // println(s"bloom ${bloom}")
          if (days >= bloom) {
            curNumberOfFlower += 1
            if (curNumberOfFlower == k) {
              canFormNumberOfBouquets += 1
              curNumberOfFlower = 0
              // println(s"canFormNumberOfBouquets increased ${}")
            }
          } else {
            curNumberOfFlower = 0
          }
          // println(s"curNumberOfFlower ${curNumberOfFlower}")
        }
        // println(s"canFormNumberOfBouquets ${canFormNumberOfBouquets}")
        canFormNumberOfBouquets >= m
      }

//      println(canFormAllBouquets(bloomDay, m, k, 12))
      var left = 1
      var right: Int = scala.math.pow(10,9).toInt
      while (left < right) {
        val mid:Int = (left + (right - left) / 2).toInt
        if (canFormAllBouquets(bloomDay, m, k, mid)) {
          right = mid
        } else {
          left = mid + 1
        }
      }
      left
    }
  }
}
