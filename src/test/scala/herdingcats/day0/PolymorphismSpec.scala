package herdingcats
package day0

import cats._
import cats.data._
import org.scalatest._
import herdingcats.dayone.EqOps._

class PolymorphismSpec extends FreeSpec with Matchers {

  "head" - {
    "it can take head of list of ints" in {
      head(1 :: 2 :: Nil) should be 1
    }

    "it can take head of list of arbitrary case classes" in {
      case class Car(name: String)
      head(Car("Civic") :: Car("CR-V") :: Nil) should be(Car("Civic"))
    }
  }
}
