package shizhan4

object PersonCaseTest {

  def main(args: Array[String]): Unit = {
    val a = PersonCase()
    val b = PersonCase("b",15)

    println(a)
    println(b)

    a.age=11
    a.name="zuowj"
    println(a)
  }

}
