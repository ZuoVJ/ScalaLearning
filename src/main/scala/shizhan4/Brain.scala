package shizhan4

/**
  * 单例模式实现：私有化构造函数，仅仅利用伴生对象的方法去创建
  * 伴生对象的任意方法都会变成该对象的静态方法。可用于实现工具类等
  */
class Brain private{

  override def toString: String = "this is brain"
}

object Brain{
  val brain = new Brain

  def getInstance = brain
}

object SingletoTest extends App{

  val  brain = Brain.getInstance
  println(brain)
}
