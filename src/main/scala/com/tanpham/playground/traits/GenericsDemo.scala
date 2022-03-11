package com.tanpham.playground.traits

object GenericsDemo extends App {

  // variance problem
  class Animal
  class Cat extends Animal
  class Dog extends Animal

  class CovariantList[+A]
  val animal: Animal = new Cat
  val animalList: CovariantList[Animal] = new CovariantList[Cat]
  // animalList.add(new Dog) ??? -> yes

  class InvariantList[A]
  // val animalInvariantList: InvariantList[Animal] = new InvariantList[Cat] // compiler error

  // Contravariance, the other way around, derive class should be in the second phrase
  class ContravariantList[-A]
  val contravariantList: ContravariantList[Cat] = new ContravariantList[Animal]
  // val contravariantList: ContravariantList[Animal] = new ContravariantList[Cat] // compiler error
  // ===> the usecase for contravariance is great. Change the list of animal to Trainer
  // you will see the difference
  class Trainer[-A]
  val trainers: Trainer[Cat] = new Trainer[Animal]

  // Bounded types or subtypes of a derived class
  class Cage[A <: Animal](animal: A) {
    override def toString(): String = {
      animal.toString
    }
  }
  val cage1 = new Cage(new Dog)
  val cage2 = new Cage[Dog](new Dog) // the same as above but more implicitly

  class MyList[+A] {
//     def add(element: A): MyList[A] = ??? // compiler error
    def add[B >: A](element: B): MyList[B] = ???
  }

}
