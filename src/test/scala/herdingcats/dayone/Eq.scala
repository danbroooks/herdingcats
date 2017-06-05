package herdingcats.dayone

import cats._
import cats.data._
import org.scalatest._
import herdingcats.dayone.EqOps._

class Eq extends FreeSpec with Matchers {

  "the stdlib allows us to compare primative values to one another" - {
    import StandardLib._

    "it can compare numbers" in {
      canCompareNumbers should be(true)
    }

    "it can compare strings" in {
      canCompareStrings should be(true)
    }

    "it also allows us to compare types that have equality built in" - {
      "it can compare Lists" in {
        canCompareLists should be(true)
      }
    }
  }


  // it should ""

  // "the Eq typeclass" should "we can compare Lists from std lib functionality" in {
  // }

  // it should "provides equality comparison for Option" in {
  //   import cats.implicits._

  //   Some("scalaz") === Some("cats") should be(false)
  //   Some(1) === Some(1) should be(true)
  // }
}
