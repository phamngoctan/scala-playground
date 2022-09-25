package com.tanpham.playground.secondTime

object PatternMatching extends App {
  def greekAlphabet(letter: Char) = {
    letter match {
      case 'a' | 'A' => "Alpha"
      case 'b' | 'B' => "Beta"
      case _ => "Not support letter"
    }
  }

  println("Greek alphabet of A is " + greekAlphabet('A'))
  println("Greek alphabet of B is " + greekAlphabet('B'))
  println("Greek alphabet of C is " + greekAlphabet('C'))

  def max(a: Int, b: Int): Int = {
//    if (a > b) {
//      return a
//    }
//    b
    a > b match {
      case true => a
      case false => b
    }
  }
  println("Max of 200, 10 is " + max(200, 10))

}
