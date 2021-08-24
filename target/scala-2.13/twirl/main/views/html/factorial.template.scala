
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
   
     

    """),format.raw/*7.5*/("""<h1> Recursive Algortithm for calculating factorial of Integer number: </h1>
        <div>
            <pre><code>
                def factorial(n: Long): Long = n match"""),format.raw/*10.55*/("""{"""),format.raw/*10.56*/("""
                    case 0 => return 1
                    case _ => return n*factorial(n-1)
                """),format.raw/*13.17*/("""}"""),format.raw/*13.18*/("""
            """),format.raw/*14.13*/("""</code></pre>
            
             </div>
             
    <h2>=> Response to the Request : the factorial is """),_display_(/*18.56*/fact),format.raw/*18.60*/("""</h2>
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
                  HASH: adddaa5b1dede9a70922a1ffac6c84d24bd1962f
                  MATRIX: 731->1|837->14|864->16|889->33|928->35|970->51|1167->220|1196->221|1334->331|1363->332|1404->345|1547->461|1572->465
                  LINES: 21->1|26->2|27->3|27->3|27->3|31->7|34->10|34->10|37->13|37->13|38->14|42->18|42->18
                  -- GENERATED --
              */
          