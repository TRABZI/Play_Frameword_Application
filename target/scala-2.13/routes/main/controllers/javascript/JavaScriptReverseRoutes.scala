// @GENERATOR:play-routes-compiler
// @SOURCE:conf/routes

import play.api.routing.JavaScriptReverseRoute


import _root_.controllers.Assets.Asset

// @LINE:9
package controllers.javascript {

  // @LINE:9
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:9
    def versioned: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.versioned",
      """
        function(file1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[play.api.mvc.PathBindable[Asset]].javascriptUnbind + """)("file", file1)})
        }
      """
    )
  
  }

  // @LINE:11
  class ReverseHomeController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:11
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + """"})
        }
      """
    )
  
    // @LINE:13
    def printSum: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.printSum",
      """
        function(firstVal0,secondVal1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "sum/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("firstVal", firstVal0)) + "/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("secondVal", secondVal1))})
        }
      """
    )
  
    // @LINE:15
    def printFactorial: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.printFactorial",
      """
        function(inputValue0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "fact/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Int]].javascriptUnbind + """)("inputValue", inputValue0))})
        }
      """
    )
  
  }


}
