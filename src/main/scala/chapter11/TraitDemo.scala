package chapter11

import java.io.PrintWriter
/*构造顺序：
1. 如果有超类，则先调用超类的构造器
2. 如果有父trait，它会按照继承层次先调用父trait的构造器
2. 如果有多个父trait，则按顺序从左到右执行
3. 所有父类构造器和父trait被构造完之后，才会构造本类

如：
class Person
class Student extends Person with FileLogger with Cloneable
上述构造器的执行顺序为:
1 首先调用父类Person的构造器
2 调用父trait Logger的构造器
3 再调用trait FileLogger构造器，再然后调用Cloneable的构造器
4 最后才调用Student的构造器*/

  trait Logger{
    println("Logger")
    def log(msg:String):Unit
  }

  trait FileLogger extends Logger{
    println("FilgeLogger")
    val fileOutput=new PrintWriter("file.log")
    fileOutput.println("#")

    def log(msg:String):Unit={
      fileOutput.print(msg)
      fileOutput.flush()
    }
  }

  trait TextLogger extends Logger{
    println("TextLogger")
    val fileOutput2=new PrintWriter("file.log")
    fileOutput2.println("#")

    def log2(msg:String):Unit={
      fileOutput2.print(msg)
      fileOutput2.flush()
    }
  }

trait FinalLogger extends FileLogger with TextLogger{
  println("FinalLogger")
  val finalOutput=new PrintWriter("file.log")
  fileOutput.println("#")

  def finalLog(msg:String):Unit={
    fileOutput.print(msg)
    fileOutput.flush()
  }
}
  object TraitDemo{
    def main(args: Array[String]): Unit = {
      //匿名类
      new FinalLogger{
      }.finalLog("trat demo")
    }
  }



