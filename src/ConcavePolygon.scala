/**
  * Created by Bruno on 10/27/2016.
  */
class ConcavePolygon {

  def area(p1 : (Double, Double))(p2: (Double, Double), p3 : (Double, Double)) : Double = {
    (p1._1*(p2._2 - p3._2) + p2._1*(p3._2 - p1._2) + p3._1*(p1._2 - p2._2)) / 2.0
  }

  def main(args : Array[String]) ={
    val points = (1 to readInt())
      .map(_ => {
        val line = readLine().split(" ")
        (line(0).toDouble, line(1).toDouble)
      })

    val min = points.reduce((x, y) => if(x._1 <= y._1) x else y)
    val cmp = area(min)_
    val sortedPoints = points.filter( x => x != min).sortWith(cmp(_, _) > 0) :+ min

    val l = (sortedPoints :+ sortedPoints(0))
      .iterator
      .sliding(3)
      .map(a => area(a(0))(a(1), a(2)))
    println(if(l.count(_ > 0) != 0 && l.count(_ < 0) != 0) "YES" else "NO")
  }
}
