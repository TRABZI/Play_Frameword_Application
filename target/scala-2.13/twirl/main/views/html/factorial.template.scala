
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

object factorial extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[Long,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(fact: Long):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""
"""),_display_(/*3.2*/main("factorial")/*3.19*/ {_display_(Seq[Any](format.raw/*3.21*/("""
    """),format.raw/*4.5*/("""<style>
        h1"""),format.raw/*5.11*/("""{"""),format.raw/*5.12*/("""
            """),format.raw/*6.13*/("""color: palevioletred;
        """),format.raw/*7.9*/("""}"""),format.raw/*7.10*/("""
        """),format.raw/*8.9*/("""h2"""),format.raw/*8.11*/("""{"""),format.raw/*8.12*/("""
            """),format.raw/*9.13*/("""color: green;
        """),format.raw/*10.9*/("""}"""),format.raw/*10.10*/("""
    """),format.raw/*11.5*/("""</style>
    <h1> Recursive Algortithm for calculating factorial of Integer number: </h1>
        <div>
            <pre><code>
                def factorial(n: Long): Long = n match"""),format.raw/*15.55*/("""{"""),format.raw/*15.56*/("""
                    case 0 => return 1
                    case _ => return n*factorial(n-1)
                """),format.raw/*18.17*/("""}"""),format.raw/*18.18*/("""
            """),format.raw/*19.13*/("""</code></pre>
            
             </div>
             
    <h2>=> Response to the Request : the factorial is """),_display_(/*23.56*/fact),format.raw/*23.60*/("""</h2>
""")))}))
      }
    }
  }

  def render(fact:Long): play.twirl.api.HtmlFormat.Appendable = apply(fact)

  def f:((Long) => play.twirl.api.HtmlFormat.Appendable) = (fact) => apply(fact)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  SOURCE: app/views/factorial.scala.html
                  HASH: 6ccbf148133ab07da0eecd2da54ee2ed73621b0a
                  MATRIX: 731->1|837->14|864->16|889->33|928->35|959->40|1004->58|1032->59|1072->72|1128->102|1156->103|1191->112|1220->114|1248->115|1288->128|1337->150|1366->151|1398->156|1608->338|1637->339|1775->449|1804->450|1845->463|1988->579|2013->583
                  LINES: 21->1|26->2|27->3|27->3|27->3|28->4|29->5|29->5|30->6|31->7|31->7|32->8|32->8|32->8|33->9|34->10|34->10|35->11|39->15|39->15|42->18|42->18|43->19|47->23|47->23
                  -- GENERATED --
              */
          