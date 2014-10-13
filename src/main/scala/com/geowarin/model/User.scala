package com.geowarin.model

import spray.json.DefaultJsonProtocol

/**
 *
 * Date: 13/10/2014
 * Time: 23:32
 * @author Geoffroy Warin (http://geowarin.github.io)
 */
case class User(name:String)

object UserJsonProtocol extends DefaultJsonProtocol {
  implicit val userFormat = jsonFormat1(User)
}
