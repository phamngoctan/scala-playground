package com.tanpham.playground.option

import scala.util.Random

object OptionDemo extends App {

  /*
  Exercise
   */
  val config: Map[String, String] = Map(
    // Fetched from elsewhere
    "host" -> "192.168.1.1",
    "port" -> "80"
  )

  class Connection {
    def connect = "Connected"
  }
  object Connection {
    val random: Random = new Random()
    def apply(host: String, port: String): Option[Connection] = {
      if (random.nextBoolean()) {
        println(s"$host:$port")
        return Some(new Connection)
      }
      None
    }
  }

  // read the config
  val host:Option[String] = config.get("host")
  val port:Option[String] = config.get("port")

  /*
  rewrite the below flatMap in if statement
  if (host.nonEmpty) {
    if (port.nonEmpty) {
      println(s"${host.get}:${port.get}")
      println(new Connection)
    }
  }
   */
  val connection = host.flatMap(h => port.flatMap(p => Connection.apply(h, p)))
  val connectionStatus: Option[String] = connection.map(c => c.connect)
//  if (connectionStatus.isEmpty) println(None) else println(Some(connectionStatus.get))
  println("connection status: " + connectionStatus)
  connectionStatus.foreach(println)

  // Replace all above codes to this
  config.get("host")
    .flatMap(host => config.get("port")
      .flatMap(port => Connection(host, port))
      .map(conn => conn.connect))
    .foreach(println)
  // Wow wow

  // Let see another Wow Wow
  val forComprehensionConnectionStatus = for (
    host1 <- config.get("host");
    port1 <- config.get("port");
    connection <- Connection(host1, port1)
  ) yield connection.connect
  println(forComprehensionConnectionStatus)
}
