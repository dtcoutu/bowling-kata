import org.scalatest.FunSpec

class FrameSpec extends FunSpec {
  describe("Frame::score") {
    it ("default value equals zero") {
      var frame = new Frame()
      val score = frame.score
      assert(score == 0)
    }

    it ("can add appropriate points to the score") {
      val pins = 7
      val frame = new Frame(List(pins))
      assert(frame.score == 7)
    }

    it ("can add two balls to a frame") {
      val frame = new Frame(List(2, 3))
      assert(frame.score == 5)
    }

    it ("errors on bad pin count") {
      val frame = new Frame(List(6, 5))
      assertThrows[InvalidScore] {
        frame.score
      }
    }
  }
}