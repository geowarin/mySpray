package com.geowarin

import com.geowarin.DB.Users
import spray.routing.SimpleRoutingApp
import sprest.routing.RestRoutes

trait Routes extends RestRoutes { this: SimpleRoutingApp =>
  import spray.httpx.encoding.Gzip

  def js = pathPrefix("js" / Rest) { fileName =>
    get {
      encodeResponse(Gzip) { getFromResource(s"js/$fileName") }
    }
  }

  def css = pathPrefix("css" / Rest) { fileName =>
    get {
      getFromResource(s"css/$fileName")
    }
  }

  def partials = pathPrefix("partials" / Rest) { fileName =>
    get {
      getFromResource(s"partials/$fileName")
    }
  }

  def index = path("") {
    get {
      getFromResource("html/index.html")
    }
  }

//  def bootstrap = pathPrefix("bootstrap" / Rest) { fileName =>
//    get {
//      getFromResource(s"twitter/bootstrap/$fileName")
//    }
//  }

  def publicAssets = js ~ css ~ partials

  def api = pathPrefix("api") {
//    path("users") {
//      get {
//        complete {
//          models.User.all.sortBy(_.value) map { u =>
//            JsObject("name" -> u.name.toJson)
//          }
//        }
//      }
//    }
//    ~
      dynamic(restString("users", Users))
//        restString("reminders", DB.Reminders))
  }

  def routes = index ~ publicAssets ~ api
}
