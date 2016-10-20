/**
  * Created by Bruno on 10/20/2016.
  */
class StringCompress {

  def compress(s1 : List[Char], s2 : List[Char], acc : List[Char]) : Unit = {
    (s1, s2) match {
      case (x1 :: xs, y1 :: ys) =>
        if(x1 == y1)
          compress(xs, ys, x1 :: acc)
        else{
          println(acc.length + " " + acc.mkString.reverse)
          println(s1.length + " " + s1.mkString)
          println(s2.length + " " + s2.mkString)
        }
      case(_, Nil) | (Nil, _) =>
        println(acc.length + " " + acc.mkString.reverse)
        println(s1.length + " " + s1.mkString)
        println(s2.length + " " + s2.mkString)
    }
  }

  def main(args: Array[String]): Unit = {
    compress(readLine().toList, readLine().toList, List())
  }
}
