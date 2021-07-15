import org.scalatest.FunSpec

class FrameSpec extends FunSpec {
  describe("Frame::score") {
    it ("default value equals zero") {
      var frame = new Frame()
      val score = frame.score
      assert(score == 0)
    }
  }

  describe("Frame::ball") {
    it ("can call the method ball and add appropriate points to the score") {
      var frame = new Frame()
      val pins = 7
      val points = frame.ball(pins)
      assert(points == 7)
    }
  }
}
