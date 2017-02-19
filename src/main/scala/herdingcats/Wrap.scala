package herdingcats

import simulacrum._

@typeclass trait Wrap[A] {
  @op("wrap") def wrap(a1: A, a2: A): A
}

