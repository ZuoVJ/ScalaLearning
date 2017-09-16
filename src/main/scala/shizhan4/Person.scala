package shizhan4

class Person(var firstName:String,var lastName:String) {

  println("the constructor begins")

  //some fields
  private val Home = System.getProperty("user.home")

  var age=0

  override def toString: String = s"$firstName is $age years old"
  def printHome{println(s"Home = $Home")}
  def printFul{println(this)}

  printHome
  printFul
  println("still in constructor")
}
