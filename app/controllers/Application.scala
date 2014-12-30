package controllers

import play.api._
import play.api.mvc._
import controllers.Authentication.loginForm

object Application extends Controller {

  def index = Action {
    Ok(views.html.index("Login page"))
  }
  
  def logged = Action{
     Ok(views.html.logout("You have logged in"))
  }
  
  def home=Action{
    Ok(views.html.home("This is home"))
  }

}
