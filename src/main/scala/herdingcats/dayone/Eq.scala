package herdingcats.dayone

import cats._
import cats.data._
import cats.implicits._

object EqOps {
  def count[A](as: List[A], a: A) =
    as.count(Eq[A].eqv(_, a))
}
