/**
  * Created by Bruno on 10/23/2016.
  */
class ValidBst {

  def readIntList() : List[Int] = {
    var a = readInt()
    readLine().split(" ").map(_.toInt).toList
  }

  def Partition(list : List[Int]) : (List[Int], List[Int]) = {
    list match {
      case (x :: xs) =>
        (xs.filter(_ <= x), xs.filter(_ > x))
        case _ => (Nil, Nil)
    }
  }

  def ValidateBst(list : List[Int]) : Boolean ={
    list match {
      case (x :: xs) =>
        if(!list
          .sliding(2)
          .foldLeft(true)((valid, pair) =>
            if (!valid)
              false
            else
              !(pair.head > x && pair.tail.head < x)))
          false
        else{
          val (ll, rl) = Partition(list)
          ValidateBst(ll) && ValidateBst(rl)
        }
      case _ => true
    }
  }

  def main(args: Array[String]) {
    (1 to readLine().toInt)
      .map(_ => readIntList())
      .map(x => ValidateBst(x))
      .map(x => println(if(x) "YES" else "NO"))
  }
}
