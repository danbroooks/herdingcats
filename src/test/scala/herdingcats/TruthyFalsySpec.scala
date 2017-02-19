package herdingcats

import org.scalatest._

class TruthyFalsySpec extends FreeSpec with Matchers {

  import TruthyFalsy.ops._

  implicit val intTruthyFalsy: TruthyFalsy[Int] = TruthyFalsy.from({
    case 0 => false
    case _ => true
  })

  "int" - {
    "can be truthy" in {
      0.truthy should be(false)
      99.truthy should be(true)
    }

    "can be falsy" in {
      0.falsy should be(true)
      99.falsy should be(false)
    }
  }
}

