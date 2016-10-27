/**
  * Created by Bruno on 10/25/2016.
  */
class PerFun {

  def main(args: Array[String]) {
    val n = readInt()
    val f = (readLine().split(" "))
      .map(_.toInt)
    (1 to n)
      .map(a => println(f(f(a - 1))))
  }

}
