package herdingcats

import simulacrum._

@typeclass trait TruthyFalsy[A] { self =>
  def truthy(a: A): Boolean

  def falsy(a: A): Boolean
}

object TruthyFalsy {
  def from[A](f: A => Boolean): TruthyFalsy[A] = new TruthyFalsy[A] {
    def truthy(a: A): Boolean = f(a)

    def falsy(a: A): Boolean = !truthy(a)
  }
}
