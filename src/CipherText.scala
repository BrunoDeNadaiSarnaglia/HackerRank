/**
  * Created by Bruno on 10/25/2016.
  */
class CipherText {

  def main(args: Array[String]): Unit = {
    val m = readLine()
    val n = readLine().toInt
    println(m
      .map(ch => ((ch - '0' + n) % 10 + '0').asInstanceOf[Char])
      .mkString)
  }

}