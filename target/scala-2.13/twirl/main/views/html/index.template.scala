
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

object index extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[Long,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(sum: Long):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""
"""),_display_(/*3.2*/main("Add two numbers")/*3.25*/ {_display_(Seq[Any](format.raw/*3.27*/("""
    """),format.raw/*4.5*/("""<h1>The sum is """),_display_(/*4.21*/sum),format.raw/*4.24*/("""!</h1>
""")))}))
      }
    }
  }

  def render(sum:Long): play.twirl.api.HtmlFormat.Appendable = apply(sum)

  def f:((Long) => play.twirl.api.HtmlFormat.Appendable) = (sum) => apply(sum)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  SOURCE: app/views/index.scala.html
                  HASH: 3f118c3fa58c9237e2be93463db19d609faf4f9c
                  MATRIX: 727->1|832->13|859->15|890->38|929->40|960->45|1002->61|1025->64
                  LINES: 21->1|26->2|27->3|27->3|27->3|28->4|28->4|28->4
                  -- GENERATED --
              */
          