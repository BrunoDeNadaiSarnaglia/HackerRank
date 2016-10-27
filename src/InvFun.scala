/**
  * Created by Bruno on 10/25/2016.
  */
class InvFun {

  def main(args: Array[String]) {
    val n = readInt()
    val f = (readLine().split(" "))
      .map(_.toInt)
    val involution = (1 to n)
      .map(a => f(f(a - 1)) == a)
      .reduce(_&& _)
    println(if(involution) "YES" else "NO")
  }
}
