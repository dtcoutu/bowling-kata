import org.scalatest.FunSuite

import java.util.{Date, GregorianCalendar}

class PersonSpec extends FunSuite {
  test("the first name is set correctly in constructor") {
    val p = new Person("Barney", "Rubble")
    assert(p.firstName == "Barney")
  }
}
