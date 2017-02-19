package herdingcats

import org.scalatest._

class WrapSpec extends FreeSpec with Matchers {

  import Wrap.ops._

  implicit val stringWrap: Wrap[String] = new Wrap[String] {
    def wrap(a1: String, a2: String): String = a1 + a2 + a1
  }

  "string" - {
    "wraps passed string" in {
      "---" wrap "title" should be("---title---")
    }
  }
}

