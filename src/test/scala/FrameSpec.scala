import org.scalatest.FunSpec

class FrameSpec extends FunSpec {
  describe("Frame::score") {
    it ("default value equals zero") {
      var frame = new Frame()
      val score = frame.score
      assert(score == 0)
    }
  }
}
