object Hello {

  val name = "sfsf"
  lazy val lazyName:String = "xiaoming"
  var changeable = "fdsf"
  def main(args: Array[String]): Unit = {
    println("Hello Scala")
//    name=""
//    lazyName = ""
    changeable = "dsff"
  }

  def max(x:Int,y:Int): Int ={
//    return x>y?x:y;
    if(x>y)
       x
    else  y
  }
//定义函数 最后的植作为返回值
  def add(x:Int,y:Int):Int={x+y}

}
