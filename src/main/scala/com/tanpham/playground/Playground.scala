package com.tanpham.playground

import java.time.Year

object Playground extends App {

  trait P[T] {
    val name: String
  }

  class Employee(val employeeName: String, yearOfBirth: Int, entryYear: Int) extends P[Employee] {
    override val name: String = employeeName
    def getInfo(): String = {
      return s"${employeeName} has been working for us since ${entryYear}. He is ${Year.now().getValue() - yearOfBirth}"
    }
  }

  val name: String = "Tan"
  val yearBirth: Int = 1980
  val entryYear: Int = 2015
  val employee = new Employee(name, yearBirth, entryYear)

  // Functional interface in java 8
  trait EmployeeCreatable[T1, T2, T3, R] {
    def create(employeeName: T1, yearOfBirth: T2, entryYear: T3): R
  }
  val anoEmpCreatable: EmployeeCreatable[String, Int, Int, Employee] = {
    // Lambda function
    (name: String, yearOfBirth: Int, entryYear: Int) => new Employee(name, yearOfBirth, entryYear)
  }
  println(anoEmpCreatable)
  println(anoEmpCreatable.create("Tan", 1981, 2020).getInfo())
  println("-----------------")

//  private implicit val mapper1: Function3[String, Int, Int, Employee] = (name: String, yearOfBirth: Int, entryYear: Int) => {
//    new Employee(name, yearOfBirth, entryYear)
//  }
  private implicit val mapper2: (String, Int, Int) => Employee = {
    (name: String, yearOfBirth: Int, entryYear: Int) => new Employee(name, yearOfBirth, entryYear)
  }
//  private implicit val mapper3 = (name: String, yearOfBirth: Int, entryYear: Int) => new Employee(name, yearOfBirth, entryYear)

  println(mapper2("Tan", 1981, 2020).getInfo())
//  println(mapper3("John", 1980, 2018))

}
