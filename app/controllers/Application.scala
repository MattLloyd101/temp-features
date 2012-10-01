package controllers

import play.api._
import play.api.mvc._
import cucumber.runtime.{Runtime, RuntimeOptions}
import cucumber.io.ClasspathResourceLoader

object Application extends Controller {

  def index = Action {
    Ok("Hello World")
  }

}