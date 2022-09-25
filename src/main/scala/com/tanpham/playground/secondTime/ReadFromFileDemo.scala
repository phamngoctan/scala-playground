package com.tanpham.playground.secondTime

import io.Source._

object ReadFromFileDemo extends App {
  // Creating file
  // Read from resources folder
  val fileName = "src/main/resources/rainbow.txt"
  for (line <- fromFile(fileName).getLines()) {
    println(s"val: ${line}")
  }

  val lineList = fromFile(fileName).getLines().toList
//  lineList.foreach(println)
  for (elem <- lineList) {
    println(s"Element: ${elem}")
  }
}
