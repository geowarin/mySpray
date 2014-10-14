package com.geowarin

import akka.actor.ActorSystem
import spray.routing.SimpleRoutingApp

object Main extends App
with SimpleRoutingApp
with spray.httpx.SprayJsonSupport
with Routes {

  override implicit val system = ActorSystem("mySpray")

  startServer(interface = "localhost", port = 8080) {
    routes
  }
}

