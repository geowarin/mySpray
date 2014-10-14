package com.geowarin.models

import sprest.models._

case class User(name: String, var id: Option[String] = None) extends Model[String]

object User extends ModelCompanion[User, String] {
  implicit val toDoFormat = jsonFormat2(User.apply _)
}
