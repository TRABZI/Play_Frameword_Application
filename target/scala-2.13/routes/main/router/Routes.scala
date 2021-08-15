// @GENERATOR:play-routes-compiler
// @SOURCE:conf/routes

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._

import play.api.mvc._

import _root_.controllers.Assets.Asset

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:9
  Assets_0: controllers.Assets,
  // @LINE:11
  HomeController_1: controllers.HomeController,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:9
    Assets_0: controllers.Assets,
    // @LINE:11
    HomeController_1: controllers.HomeController
  ) = this(errorHandler, Assets_0, HomeController_1, "/")

  def withPrefix(addPrefix: String): Routes = {
    val prefix = play.api.routing.Router.concatPrefix(addPrefix, this.prefix)
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, Assets_0, HomeController_1, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    ("""GET""", this.prefix, """controllers.HomeController.index()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """sum/""" + "$" + """firstVal<[^/]+>/""" + "$" + """secondVal<[^/]+>""", """controllers.HomeController.printSum(firstVal:Long, secondVal:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """fact/""" + "$" + """inputValue<[^/]+>""", """controllers.HomeController.printFactorial(inputValue:Int)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:9
  private[this] lazy val controllers_Assets_versioned0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned0_invoker = createInvoker(
    Assets_0.versioned(fakeValue[String], fakeValue[Asset]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      this.prefix + """assets/""" + "$" + """file<.+>""",
      """""",
      Seq()
    )
  )

  // @LINE:11
  private[this] lazy val controllers_HomeController_index1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_HomeController_index1_invoker = createInvoker(
    HomeController_1.index(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "index",
      Nil,
      "GET",
      this.prefix + """""",
      """""",
      Seq()
    )
  )

  // @LINE:13
  private[this] lazy val controllers_HomeController_printSum2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("sum/"), DynamicPart("firstVal", """[^/]+""",true), StaticPart("/"), DynamicPart("secondVal", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_printSum2_invoker = createInvoker(
    HomeController_1.printSum(fakeValue[Long], fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "printSum",
      Seq(classOf[Long], classOf[Long]),
      "GET",
      this.prefix + """sum/""" + "$" + """firstVal<[^/]+>/""" + "$" + """secondVal<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:15
  private[this] lazy val controllers_HomeController_printFactorial3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("fact/"), DynamicPart("inputValue", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_printFactorial3_invoker = createInvoker(
    HomeController_1.printFactorial(fakeValue[Int]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "printFactorial",
      Seq(classOf[Int]),
      "GET",
      this.prefix + """fact/""" + "$" + """inputValue<[^/]+>""",
      """""",
      Seq()
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:9
    case controllers_Assets_versioned0_route(params@_) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned0_invoker.call(Assets_0.versioned(path, file))
      }
  
    // @LINE:11
    case controllers_HomeController_index1_route(params@_) =>
      call { 
        controllers_HomeController_index1_invoker.call(HomeController_1.index())
      }
  
    // @LINE:13
    case controllers_HomeController_printSum2_route(params@_) =>
      call(params.fromPath[Long]("firstVal", None), params.fromPath[Long]("secondVal", None)) { (firstVal, secondVal) =>
        controllers_HomeController_printSum2_invoker.call(HomeController_1.printSum(firstVal, secondVal))
      }
  
    // @LINE:15
    case controllers_HomeController_printFactorial3_route(params@_) =>
      call(params.fromPath[Int]("inputValue", None)) { (inputValue) =>
        controllers_HomeController_printFactorial3_invoker.call(HomeController_1.printFactorial(inputValue))
      }
  }
}
