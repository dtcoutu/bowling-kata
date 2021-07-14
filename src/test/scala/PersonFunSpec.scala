import org.scalatest.FunSpec

class PersonFunSpec extends FunSpec {
  describe("Person::fullName") {
    it("should combine names") {
      val p = new Person("James", "Bond")
      assert(p.fullName == "James Bond")
    }
  }
}
