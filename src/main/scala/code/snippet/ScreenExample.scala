package code.snippet

import net.liftweb._
import http._

/**
 * User: Gerard Rakoczy
 * Date: 04/06/13
 * Time: 13.11
 */

object ScreenExample extends LiftScreen {

  // here are the fields and default values
  val name = field("Name", "")

  // the age has validation rules
  val age = field("Age", 0, minVal(13, "Too Young"))

  def finish() {
    S.notice("Name: " + name)
    S.notice("Age: " + age)
  }
}