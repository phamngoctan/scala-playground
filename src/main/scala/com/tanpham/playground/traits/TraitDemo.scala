package com.tanpham.playground.traits

object TraitDemo {

  """
    |
    |Traits are used to share interfaces and fields between classes. They are similar to Java 8’s interfaces.
    |Classes and objects can extend traits, but traits cannot be instantiated and therefore have no parameters.
    |
    |""".stripMargin

  trait Iterator[A] {
    def hasNext: Boolean
    def next(): A
  }

  // Good to know
  class IntIterator(to: Int) extends Iterator[Int] {
    private var current = 0
    override def hasNext: Boolean = current < to
    override def next(): Int = {
      if (hasNext) {
        val temp = current
        current += 1
        temp
      } else 0
    }
  }

  def main(args: Array[String]): Unit = {
    println("Trait demonstration")
    val demoIntIterator = new IntIterator(10)
    println(s"${demoIntIterator.next()}") // 0
    assert(demoIntIterator.next() == 1)
    assert(demoIntIterator.next() == 2)
    assert(demoIntIterator.next() == 3)
  }

}
