package com.tanpham.playground.secondTime

import scala.collection.mutable.ListBuffer

object DemoOOM extends App {
  """
    | This takes around 2 minutes to finish
    | resulted in OOM error
    | Using jvisualvm to track the memory in heap
    | vm options:
    |-Xmx3m
    |-verbose:gc
    |-XX:+UseG1GC
    |-XX:CICompilerCount=2
    |-XX:ParallelGCThreads=2
    |-XX:+ExitOnOutOfMemoryError
    |-XX:+CrashOnOutOfMemoryError
    |-XX:+UseStringDeduplication
    |""".stripMargin

  var demoOOM = ListBuffer[Int]()
  var i = 0
  while (true) {
    //    val curVal = Random.nextInt()
    //    println(s"${curVal}")
    //    val curVal = i
    demoOOM += i
    i += 1
    if (i % 5 == 0) {
      Thread.sleep(1)
      println("sleep")
    }
  }

  for(
    i <- demoOOM
  ) yield {
    println(i)
  }
}
