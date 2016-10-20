/**
  * Created by Bruno on 10/20/2016.
  */
class StringReduction {

  def main(args : Array[String]): Unit ={
    println(readLine()
      .toList
      .distinct
      .mkString)
  }
}
