
class Frame(balls: List[Int] = List()) {
  def ball(pins: Int): Frame = {
    new Frame(this.balls :+ pins)
  }

  def score:Int = balls.sum
}
