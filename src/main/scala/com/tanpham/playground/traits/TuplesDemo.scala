package com.tanpham.playground.traits

object TuplesDemo {

  def main(args: Array[String]): Unit = {
    val ingredient = ("Sugar", 25) // Tuple2[String, Int]
    // Accessing tuple
    println(s"${ingredient._1} - ${ingredient._2}")

    // pattern matching
    val (name, quantity) = ingredient
    println(name) // Sugar
    println(quantity) // 25

    // unpack the tuple
    val planets =
      List(("Mercury", 57.9), ("Venus", 108.2), ("Earth", 149.6),
        ("Mars", 227.9), ("Jupiter", 778.3))
    planets.foreach({
      case ("Earth", distance) =>
        println(s"Our planet is $distance million kilometers from the sun")
      case _ => // do nothing
    })

    // for comprehension
    val numPairs = List((1,2), (2,3), (3,4))
    for ((a, b) <- numPairs ) yield println(s"${a} ${b}")
    val flatternKeyValue = for ((a, b) <- numPairs ) yield s"${a} ${b}"
    println(s"${flatternKeyValue}")

    println("end")
  }

}
