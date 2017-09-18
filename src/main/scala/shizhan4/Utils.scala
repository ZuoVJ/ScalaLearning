package shizhan4

/**
  * 伴生对象的任意方法都会变成该对象的静态方法。可用于实现工具类等
  */
object Utils {

  def someUtil()={
    //proceed
  }
}

object TestUtils{
  def main(args: Array[String]): Unit = {
    //可直接调用，不用创建对象什么的
    Utils.someUtil()
  }
}
