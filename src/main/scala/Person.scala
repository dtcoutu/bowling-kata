import java.util.Date

class Person(val firstName:String, val lastName:String) {
  def fullName: String = {
    firstName + " " + lastName
  }
}
