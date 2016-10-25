/**
  * Created by Bruno on 10/24/2016.
  */
class ConvexHull {

  def comparePoints(p1 : (Double, Double))(p2: (Double, Double), p3 : (Double, Double)) : Double = {
    (p1._1*(p2._2 - p3._2) + p2._1*(p3._2 - p1._2) + p3._1*(p1._2 - p2._2)) / 2.0
  }

  def dist(p1: (Double, Double), p2 :(Double, Double)) : Double = {
    Math.sqrt(Math.pow(p1._1 - p2._1,2) + Math.pow(p1._2 - p2._2,2))
  }

  def main(args: Array[String]): Unit = {
    val points = (1 to readInt())
      .map(_ => {
        val line = readLine().split(" ")
        (line(0).toDouble, line(1).toDouble)
      }).toList
    val min = points.reduce((x, y) => if(x._1 <= y._1) x else y)
    val cmp = comparePoints(min)_
    val sortedPoints = (points filter( x => x != min) sortWith ((x,y) => {
      if(cmp(x,y) > 0)
        true
      else
        false
    } )) :+ min
    println(sortedPoints)
    var convex = List(sortedPoints.head, min)
    sortedPoints.tail.foreach(x => {
      println(x)
      println(convex)
      while (comparePoints(convex.tail.head)(convex.head, x) < 0){
        convex = x :: convex.tail
      }
      if (comparePoints(convex.tail.head)(convex.head, x) > 0)
        convex = x :: convex
      else if (comparePoints(convex.tail.head)(convex.head, x) == 0){
        if(dist(convex.tail.head, x) > dist(convex.tail.head, convex.head))
          convex = x :: convex.tail
      }
      else
        convex = x :: convex.tail
    })
    println(convex)
    convex.iterator.sliding(2).map(l => {
      println (l)
      dist(l(0), l(1))
    }).sum
  }


}
