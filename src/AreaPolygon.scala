/**
  * Created by Bruno on 10/24/2016.
  */
class AreaPolygon {

  def area(p1 : (Double, Double), p2: (Double, Double), p3 : (Double, Double)) : Double = {
    (p1._1*(p2._2 - p3._2) + p2._1*(p3._2 - p1._2) + p3._1*(p1._2 - p2._2)) / 2.0
  }

  def main(args : Array[String]) ={
    val points = (1 to readInt())
      .map(_ => {
        val line = readLine().split(" ")
        (line(0).toDouble, line(1).toDouble)
        })
      println(points
        .drop(1)
        .sliding(2)
        .map(a => area(points(0), a(0), a(1)))
        .sum)
  }

}
