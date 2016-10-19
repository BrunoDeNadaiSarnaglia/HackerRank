/**
  * Created by Bruno on 10/19/2016.
  */
class StringMingling {


  def strMingling(p : List[Char], q : List[Char]) : List[Char] ={
    (p, q) match {
      case (p1 :: ps, q1 :: qs) => p1 :: q1 :: strMingling(ps, qs)
      case (Nil, Nil) => Nil
      case _ => throw new Exception
    }
  }

  def main(args: Array[String]) {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution
*/  println(strMingling(readLine().toList, readLine().toList).mkString)
  }
}
