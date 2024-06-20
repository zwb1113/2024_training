
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

object listWidgets extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template4[Seq[Widget],Form[WidgetForm.Data],Call,MessagesRequestHeader,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(widgets: Seq[Widget], form: Form[WidgetForm.Data], postUrl: Call)(implicit request: MessagesRequestHeader):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""
  """),_display_(/*3.4*/main("Widgets")/*3.19*/ {_display_(Seq[Any](format.raw/*3.21*/("""

    """),format.raw/*5.5*/("""<h1>Widgets</h1>

    """),format.raw/*7.40*/("""
    """),_display_(/*8.6*/request/*8.13*/.flash.data.map/*8.28*/{ case (name, value) =>_display_(Seq[Any](format.raw/*8.51*/("""
      """),format.raw/*9.7*/("""<div>"""),_display_(/*9.13*/name),format.raw/*9.17*/(""": """),_display_(/*9.20*/value),format.raw/*9.25*/("""</div>
    """)))}),format.raw/*10.6*/("""

    """),format.raw/*12.5*/("""<table>
      <thead>
        <tr><th>Name</th><th>Price</th>
      </thead>
      <tbody>
      """),_display_(/*17.8*/for(w <- widgets) yield /*17.25*/ {_display_(Seq[Any](format.raw/*17.27*/("""
        """),format.raw/*18.9*/("""<tr><td>"""),_display_(/*18.18*/w/*18.19*/.name),format.raw/*18.24*/("""</td><td>"""),_display_(/*18.34*/w/*18.35*/.price),format.raw/*18.41*/("""</td></tr>
      """)))}),format.raw/*19.8*/("""
      """),format.raw/*20.7*/("""</tbody>
    </table>

    <hr/>

    """),format.raw/*25.66*/("""
    """),_display_(if(form.hasGlobalErrors)/*26.30*/ {_display_(Seq[Any](format.raw/*26.32*/("""
      """),_display_(/*27.8*/form/*27.12*/.globalErrors.map/*27.29*/ { error: FormError =>_display_(Seq[Any](format.raw/*27.51*/("""
        """),format.raw/*28.9*/("""<div>
          """),_display_(/*29.12*/error/*29.17*/.key),format.raw/*29.21*/(""": """),_display_(/*29.24*/error/*29.29*/.message),format.raw/*29.37*/("""
        """),format.raw/*30.9*/("""</div>
      """)))}),format.raw/*31.8*/("""
    """)))} else {null} ),format.raw/*32.6*/("""

    """),_display_(/*34.6*/helper/*34.12*/.form(postUrl)/*34.26*/ {_display_(Seq[Any](format.raw/*34.28*/("""
      """),_display_(/*35.8*/helper/*35.14*/.CSRF.formField),format.raw/*35.29*/("""

      """),_display_(/*37.8*/helper/*37.14*/.inputText(form("name"))),format.raw/*37.38*/("""

      """),_display_(/*39.8*/helper/*39.14*/.inputText(form("price"))),format.raw/*39.39*/("""

      """),format.raw/*41.7*/("""<button>Create widget</button>
    """)))}),format.raw/*42.6*/("""
  """)))}),format.raw/*43.4*/("""
"""))
      }
    }
  }

  def render(widgets:Seq[Widget],form:Form[WidgetForm.Data],postUrl:Call,request:MessagesRequestHeader): play.twirl.api.HtmlFormat.Appendable = apply(widgets,form,postUrl)(request)

  def f:((Seq[Widget],Form[WidgetForm.Data],Call) => (MessagesRequestHeader) => play.twirl.api.HtmlFormat.Appendable) = (widgets,form,postUrl) => (request) => apply(widgets,form,postUrl)(request)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  SOURCE: app/views/listWidgets.scala.html
                  HASH: 25ab1c8534252f3d33a86c5ecb49858038ddc227
                  MATRIX: 789->1|990->109|1019->113|1042->128|1081->130|1113->136|1162->193|1193->199|1208->206|1231->221|1291->244|1324->251|1356->257|1380->261|1409->264|1434->269|1476->281|1509->287|1633->385|1666->402|1706->404|1742->413|1778->422|1788->423|1814->428|1851->438|1861->439|1888->445|1936->463|1970->470|2036->569|2093->599|2133->601|2167->609|2180->613|2206->630|2266->652|2302->661|2346->678|2360->683|2385->687|2415->690|2429->695|2458->703|2494->712|2538->726|2587->732|2620->739|2635->745|2658->759|2698->761|2732->769|2747->775|2783->790|2818->799|2833->805|2878->829|2913->838|2928->844|2974->869|3009->877|3075->913|3109->917
                  LINES: 21->1|26->2|27->3|27->3|27->3|29->5|31->7|32->8|32->8|32->8|32->8|33->9|33->9|33->9|33->9|33->9|34->10|36->12|41->17|41->17|41->17|42->18|42->18|42->18|42->18|42->18|42->18|42->18|43->19|44->20|49->25|50->26|50->26|51->27|51->27|51->27|51->27|52->28|53->29|53->29|53->29|53->29|53->29|53->29|54->30|55->31|56->32|58->34|58->34|58->34|58->34|59->35|59->35|59->35|61->37|61->37|61->37|63->39|63->39|63->39|65->41|66->42|67->43
                  -- GENERATED --
              */
          