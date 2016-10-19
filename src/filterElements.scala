/**
  * Created by Bruno on 10/19/2016.
  */
class filterElements {



  def main(args: Array[String]) {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution
*/  for (i <- 1 to readInt()){
      val k = readLine.split(" ").map(_.toInt).toList(1)
      val input = readLine
        .split(" ")
        .map(_.toInt)
        .toList
      val l = input
        .groupBy(identity)
        .mapValues(_.size)
        .filter(_._2 >= k)
        .map(_._1).toList
      if(l.isEmpty)
        println(-1)
      else
        println(input.filter(l.contains(_)).distinct.mkString(" "))
    }
  }
}
