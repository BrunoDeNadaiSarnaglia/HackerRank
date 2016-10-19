/**
  * Created by Bruno on 10/19/2016.
  */
class PascalTriangle {

  def pascal(x : Int, y : Int): Int ={
    if(y == 1 || x == y)
      1
    else
      pascal(x - 1, y) + pascal(x - 1, y - 1)
  }

  def main(args: Array[String]) {
    val n = readInt();
    for (
      i <- 1 to n
    ) {
      for (
        j <- 1 to i
      ) {
        print(pascal(i, j) + " ")
      }
      println()
    }
  }
}
