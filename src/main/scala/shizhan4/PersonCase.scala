package shizhan4

case class PersonCase(var name:String,var age:Int)

object PersonCase {

  def apply( name: String, age: Int
  ): PersonCase = new PersonCase( name, age)

  def apply(): PersonCase = new PersonCase("zuo",18)
}
