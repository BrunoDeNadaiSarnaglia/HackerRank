import scala.collection.immutable.TreeMap

/**
  * Created by Bruno on 10/21/2016.
  */
class SumPow {



  def main(args : Array[String]): Unit ={
    val sum = readInt()
    val n = readInt()
    lazy val streamPow = Stream.from(1) map (x => Math.pow(x, n).asInstanceOf[Int])
    var t = TreeMap[Int, Int]()
    t += 0 -> 1
    streamPow
      .takeWhile((a) => a <= sum)
      .foreach(
        (pow) => {
          var map = Map[Int, Int]()
          t foreach ((a) =>
            if(pow + a._1 <= sum)
              map += (pow + a._1) -> a._2)
          map foreach((a) =>
            if(t.contains(a._1))
              t += a._1 -> (t(a._1) + a._2)
            else
              t += a._1 -> a._2)
        }
      )
    println(if(t contains sum ) t(sum) else 0)
  }
}
