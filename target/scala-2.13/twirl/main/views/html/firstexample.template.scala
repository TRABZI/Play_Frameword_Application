
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

object firstexample extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""
"""),_display_(/*3.2*/main("Welcome to Introduction to Play Framework!")/*3.52*/ {_display_(Seq[Any](format.raw/*3.54*/("""
    """),format.raw/*4.5*/("""<h1>Welcome to Play Framework!</h1>
    <p>
        <ul>
            <li>to get the factoial of 10(or another integer) type :  http://localhost:9000/fact/10 </li>
            <li>to get the sum of two integers type : http://localhost:9000/sum/10/20 </li>
        </ul>
    </p>
""")))}))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  SOURCE: app/views/firstexample.scala.html
                  HASH: bb629b37300c74f6609581cf2219399e1fe33e5a
                  MATRIX: 729->1|825->4|852->6|910->56|949->58|980->63
                  LINES: 21->1|26->2|27->3|27->3|27->3|28->4
                  -- GENERATED --
              */
          