/**
  * Created by Bruno on 10/23/2016.
  */
class ListGcd {

  def GroupInTwo(input : String): List[(Int, Int)] = {
    input
      .split(" ")
      .toList
      .grouped(2)
      .map{ case List(a,b) => (a.toInt, b.toInt) }
      .toList
  }

  def Gcd(num1: List[(Int, Int)], num2: List[(Int, Int)]) : List[(Int, Int)] = {
    (num1, num2) match {
      case ((x :: xs), (y :: ys)) =>
        if(x._1 < y._1)
          Gcd(xs, num2)
        else if (y._1 < x._1)
          Gcd(num1, ys)
        else
          (x._1, Math.min(x._2, y._2)) :: Gcd(xs, ys)
      case _ => Nil
    }
  }

  def main(args: Array[String]): Unit = {
    println(
      (1 to readInt())
        .map(_ => GroupInTwo(readLine()))
        .toList
        .reduce((l1, l2) => Gcd(l1, l2))
        .flatMap(a => List(a._1, a._2))
        .mkString(" "))
  }


}
