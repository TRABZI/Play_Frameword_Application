package controllers

import javax.inject._
import play.api._
import play.api.mvc._


@Singleton
class HomeController @Inject()(val controllerComponents: ControllerComponents) extends BaseController {


  def index() = Action { implicit request: Request[AnyContent] =>
    Ok(views.html.firstexample())
  }
  
  def printSum(firstVal:Long,secondVal:Long)=Action{
  	implicit request: Request[AnyContent] => val sum=firstVal+secondVal
  	Ok(views.html.index(sum))
  }
  
  def factorial(n: Long): Long = n match{
      case 0 => return 1
      case _ => return n*factorial(n-1)
    }
    
  def printFactorial(inputValue:Long)=Action{
  	implicit request: Request[AnyContent] => val fact=factorial(inputValue)
  	Ok(views.html.factorial(fact))
  }
}
