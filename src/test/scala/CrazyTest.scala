import org.scalamock.scalatest.MockFactory
import org.scalatest.FreeSpec

class CrazyTest extends FreeSpec with MockFactory {
  "crazy stub" in {
    val crazy = stub[Crazy]
    assert(crazy.toString === "crazy")
  }

  "crazy mock" in {
    val crazy = mock[Crazy]
    assert(crazy.toString === "crazy")
  }
}

class Crazy {
  override def toString = "crazy"

  private val s = "=" * 20
  println(s"$s just to show a point: $toString $s")
}
