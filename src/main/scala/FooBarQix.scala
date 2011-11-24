/**
 * User: VidalTeam - @paulgreg @jblemee @tonyskn @a_thieriot @ugobourdon alexpichon
 * Date: 24/11/11
 */

object FooBarQix {

  val FOO: String = "Foo"
  val BAR: String = "Bar"
  val QIX: String = "Qix"

  def apply(number : Int) : String =  {
    val result : String = applyDivision(number) + applyReplacement(number)

    if (result isEmpty) number.toString else result
  }

  private def applyDivision(number: Int): String = {
    var result: String = ""

    if ( isDivisibleBy( number, 3 ) ) result += FOO
    if ( isDivisibleBy( number, 5 ) ) result += BAR
    if ( isDivisibleBy( number, 7 ) ) result += QIX

    result
  }

  private def applyReplacement(number: Int): String = {
    var result: String = ""

    number.toString.foreach(
      c =>
       c match {
        case '3' => result += FOO
        case '5' => result += BAR
        case '7' => result += QIX
        case _ => result += ""
      }
    )

    result
  }

  private def isDivisibleBy(number: Int,  divisible: Int): Boolean = {
    number % divisible == 0
  }
}