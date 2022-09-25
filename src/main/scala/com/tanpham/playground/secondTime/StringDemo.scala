package com.tanpham.playground.secondTime

object StringDemo extends App {

  var word = "Monday morning"
  // until (exclusive) vs to keyword (inclusive)
  for (x <- 0 until word.length) {
//    println(s"${word(x)}")
    println(s"${word.charAt(x)}")
  }

}
