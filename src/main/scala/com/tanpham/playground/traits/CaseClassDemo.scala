package com.tanpham.playground.traits

/**
 * Case classes are good for modeling immutable data
 */
object CaseClassDemo extends App {

  case class Book(isbn: String)
  val frankenstein = Book("978-0486282114")
  println(frankenstein)

  case class Message(sender: String, recipient: String, body: String)
  val message1 = Message("guillaume@quebec.ca", "jorge@catalonia.es", "Ça va ?")

  println(message1.sender)  // prints guillaume@quebec.ca
  // message1.sender = "travis@washington.us"  // this line does not compile

  // Instances of case classes are compared by structure and NOT by reference
  case class AppMessage(sender: String, recipient: String)
  val mess1 = AppMessage("John", "Bob")
  val mess2 = AppMessage("John", "Bob")
  assert(mess1 == mess2)

}
