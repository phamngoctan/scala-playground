package com.tanpham.playground

object DemoCompanionObjects extends App {
  val rectangle = Shape(10, 5)
  print(s"area of rectange var ${rectangle.area}")

  val circle = Shape(10)
  print(s"area of circle var is ${circle.area}")
}

trait Shape {
  def area :Double
}

object Shape {
  private class Circle(radius: Double) extends Shape{
    override val area = 3.14*radius*radius
  }
  private class Rectangle (height: Double, length: Double)extends Shape{
    override val area = height * length
  }
  def apply(height :Double , length :Double ) : Shape = new Rectangle(height,length)
  def apply(radius :Double) : Shape = new Circle(radius)
}