/**
  * Created by Bruno on 10/20/2016.
  */
class StringCompress {

  def Compress(l : List[Char]) : Unit = {
    def Compress(l : List[Char], count : Int, ch : Char) : Unit = {
      l match {
        case (x :: xs) =>
          if (ch == x)
            Compress(xs, count + 1, ch)
          else{
            println(ch + "" + (if(count == 1) "" else count))
            Compress(xs, 1, x)
          }
        case Nil =>
          println(ch + "" + (if(count == 1) "" else count))
      }
    }
    if(l.nonEmpty)
      Compress(l drop 1, 1, l.head)
  }

  def main(args: Array[String]){
    Compress(readLine().toList)
  }
}
