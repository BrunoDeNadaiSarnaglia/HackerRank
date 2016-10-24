/**
  * Created by Bruno on 10/24/2016.
  */
class PerimeterPolygon {

  def main(args: Array[String]) ={
    val points = (1 to readInt())
      .map(_ => {
        val line = readLine().split(" ")
        (line(0).toDouble, line(1).toDouble)
      })
    println((points :+ points(0))
        .sliding(2)
        .map(a => Math.sqrt(Math.pow(a(0)._1 - a(1)._1,2) + Math.pow(a(0)._2 - a(1)._2,2)))
        .sum
      )
  }
}
