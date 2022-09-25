package com.tanpham.playground.secondTime

import java.io.FileNotFoundException
import scala.io.Source.fromFile

object ErrorHandling extends App {

  try {
    for (line <- fromFile("noFile.txt")) {
      println(line)
    }
  } catch {
    case e: FileNotFoundException => println("File not found, please double check the file name and path " + e)
    case b: Exception => println("Unexpected error " + b)
  }

//  try {
//    var tryToMakeException = 10/0
//  } catch {
//    case e: ArithmeticException => println("Divide to zero exception" + e)
//  }
}
