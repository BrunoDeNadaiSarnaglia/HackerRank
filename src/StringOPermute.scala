/**
  * Created by Bruno on 10/19/2016.
  */
class StringOPermute {

  def permuteNeighbours(list : List[Char]) : List[Char] = {
    list match {
      case x1 :: x2 :: xs => x2 :: x1 :: permuteNeighbours(xs)
      case Nil => Nil
      case _ => throw new Exception
    }
  }

  def main(args: Array[String]) {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution
*/  for(i <- 1 to readInt()){
      println(permuteNeighbours(readLine().toList).mkString)
    }
  }
}
