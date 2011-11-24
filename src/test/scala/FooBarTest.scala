import org.scalatest.FunSuite
import org.scalatest.matchers.ShouldMatchers

/**
 * User: User: VidalTeam - @paulgreg @jblemee @tonyskn @a_thieriot @ugobourdon alexpichon
 * Date: 24/11/11
 */


class FooBarTest extends FunSuite with ShouldMatchers {


  test("1 should return 1") {
      FooBarQix(1) should be ("1")
  }

  test("2 should return 2") {
    FooBarQix(2) should be ("2")
  }

  test("6 should return Foo") {
    FooBarQix(6) should be ("Foo")
  }

  test("3 should return FooFoo") {
    FooBarQix(3) should be ("FooFoo")
  }

  test("13 should return Foo") {
    FooBarQix(13) should be ("Foo")
  }

  test("33 should return FooFooFoo") {
    FooBarQix(33) should be ("FooFooFoo")
  }

  test("10 should return Bar") {
    FooBarQix(10) should be ("Bar")
  }

  test("5 should return BarBar") {
    FooBarQix(5) should be ("BarBar")
  }

  test("14 should return Qix") {
    FooBarQix(14) should be ("Qix")
  }

  test("7 should return QixQix") {
    FooBarQix(7) should be ("QixQix")
  }


  /* Test After */

  test("53 should return BarFoo") {
    FooBarQix(53) should be ("BarFoo")
  }

  test("100 should return Bar") {
    FooBarQix(100) should be ("Bar")
  }

}