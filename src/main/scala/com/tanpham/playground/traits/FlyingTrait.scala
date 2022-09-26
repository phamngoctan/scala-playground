package com.tanpham.playground.traits

object FlyingTrait extends App {
  val vehicle3 = new Batmobile(300)
  vehicle3.fly()
}

trait flying {
  def fly() = println("flying")
}

trait gliding {
  def gliding() = println("gliding")
}

class Vehicle (speed : Int){
  val mph :Int = speed
  def race() = println("Racing")
}

class Batmobile(speed : Int) extends Vehicle(speed) with flying with gliding{
  override val mph: Int = speed
  override def race() = println("Racing Batmobile")
  override def fly() = println("Flying Batmobile")
//  override def float() = println("Gliding Batmobile")
}