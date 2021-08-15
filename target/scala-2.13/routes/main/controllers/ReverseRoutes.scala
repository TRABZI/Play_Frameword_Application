// @GENERATOR:play-routes-compiler
// @SOURCE:conf/routes

import play.api.mvc.Call


import _root_.controllers.Assets.Asset

// @LINE:9
package controllers {

  // @LINE:9
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:9
    def versioned(file:Asset): Call = {
      implicit lazy val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/public"))); _rrc
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[play.api.mvc.PathBindable[Asset]].unbind("file", file))
    }
  
  }

  // @LINE:11
  class ReverseHomeController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:11
    def index(): Call = {
      
      Call("GET", _prefix)
    }
  
    // @LINE:13
    def printSum(firstVal:Long, secondVal:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "sum/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("firstVal", firstVal)) + "/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("secondVal", secondVal)))
    }
  
    // @LINE:15
    def printFactorial(inputValue:Int): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "fact/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Int]].unbind("inputValue", inputValue)))
    }
  
  }


}
