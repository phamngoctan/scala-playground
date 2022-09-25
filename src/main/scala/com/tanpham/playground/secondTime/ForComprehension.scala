package com.tanpham.playground.secondTime

import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.{Future}

object ForComprehension extends App {
  var i = 0
  val callA = Future {
    i += 1
    println("Call A at " + i)
    Future.unit
  }

  val callB = Future {
    i += 1
    println("Call B at " + i)
    Future.unit
  }

  for {
    _ <- callA
    _ <- callA
  } yield ()

//  callA foreach {
//    println("Trigger")
//  }
//  private val callEventualUnit: Future[Unit] = Await.result(callA, Duration.apply(1, TimeUnit.MINUTES))
  for {
    _ <- callA
    _ <- callA
    _ <- callA
    _ <- callB
  } yield (println("Hey"))

  for {
    _ <- callA
    _ <- callA
    _ <- callA
    _ <- callB
  } yield (println("Hey"))
}
