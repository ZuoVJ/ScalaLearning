package program.c4

class ChecksumAccumulator {

  private var sum=0;
  def add(b:Byte){sum+=b};
  def checksm():Int= ~(sum&0xFF)+1


}

object ChecksumAccumulator{
  private val cache = Map[String,Int]()

  def calculate(s : String): Int =
    if (cache.contains(s))
      cache(s)
  else{
      val acc = new ChecksumAccumulator
      for (c<-s)
        acc.add(c.toByte)
      val cs = acc.checksm()
//      cache += (s -> cs)
      cs

    }
}
