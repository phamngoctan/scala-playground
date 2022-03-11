package com.tanpham.playground.traits

object MixinsDemo extends App {

  abstract class A {
    val message: String
  }

  class B extends A {
    override val message: String = "I am an instance of class B"
  }

  // a mixin C
  trait C extends A {
    def loudMessage = message.toUpperCase()
  }

  //class D extends B with C {}
  // or in short
  class D extends B with C {
    override def loudMessage: String = super.loudMessage.toLowerCase()
  }

  """
    |Class D has a superclass B and a mixin C.
    |Classes can only have one superclass but many mixins (using the keywords extends and with respectively).
    |The mixins and the superclass may have the same supertype.
    |""".stripMargin

  val d = new D
  assert(d.message == "I am an instance of class B")
  assert(d.loudMessage == "I am an instance of class B".toUpperCase().toLowerCase())

}
