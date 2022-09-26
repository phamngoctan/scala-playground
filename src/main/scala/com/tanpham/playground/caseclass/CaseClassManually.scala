package com.tanpham.playground.caseclass

object CaseClassManually extends App {

  val stuff1 = Stuff("Tan", 18)
  val stuff2 = Stuff("Tan", 18)
  assert(stuff1 == stuff2)

  val manualStuff1 = new ManualStuff("Tan", 18)
  val manualStuff2 = new ManualStuff("Tan", 18)
  assert(manualStuff1 == manualStuff2)

  // apply method from companion object
  val manualStuff3 = ManualStuff("Tan", 18)
  val manualStuff4 = ManualStuff("Tan", 18)
  assert(manualStuff1 == manualStuff2)
}

case class Stuff(name: String, age: Int)

// The same definition like Stuff case class
// Too much boilerplate code
class ManualStuff(val name: String, val age: Int) {
  override def toString: String = s"ManualStuff($name,$age)"
  override def hashCode(): Int = name.hashCode + age
  override def equals(other: Any): Boolean = other match {
    case s: ManualStuff => s.age == this.age && s.name == this.name
    case _ => false
  }
}

// Companion object
object ManualStuff {
  def apply(name: String, age: Int) = new ManualStuff(name,age)
  def unapply(s: ManualStuff)= Some((s.name, s.age))
}