/**
  * Created by Bruno on 10/24/2016.
  */
class ValidFunction {



  def main(args: Array[String]) {
    for ( i <- 1 to readInt()) {
      val l = (1 to readInt())
        .map(_ => {
          val line = readLine().split(" ")
          (line(0).toInt, line(1).toInt)
        })
      var map = Map[Int, Int]()
      val isValid = l.map(a => {
        if(!map.contains(a._1)){
            map += a._1 -> a._2
            true
          }
          else if(map(a._1) == a._2)
            true
          else
            false
        })
        .reduceLeft(_ && _)
      println(if(isValid) "YES" else "NO")
    }
  }
}
