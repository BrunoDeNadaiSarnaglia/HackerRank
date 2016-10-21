/**
  * Created by Bruno on 10/20/2016.
  */
class FullColors {

  def main(args : Array[String]): Unit = {

    def Count(incChar: Char)(decChar : Char)(currentChar : Char, tuple : (Int, Int, Int)) : (Int, Int, Int) = {
      if(currentChar == incChar)
        (tuple._1, Math .max(tuple._2, tuple._3 + 1), tuple._3 + 1)
      else if(currentChar == decChar)
        (Math.min(tuple._1, tuple._3 - 1), tuple._2, tuple._3 - 1)
      else
        tuple
    }
    for (i <- 1 to readInt()){
      val l = readLine().toList
      if(l.count(_ == 'R') != l.count(_ == 'G'))
        println("FALSE")
      else if(l.count(_ == 'Y') != l.count(_ == 'B'))
        println("FALSE")
      else if(l.foldRight((0, 0, 0))(Count('R')('G'))._1 < - 1 || l.foldRight((0, 0, 0))(Count('R')('G'))._2 > 1 )
        println("FALSE")
      else if(l.foldRight((0, 0, 0))(Count('Y')('B'))._1 < - 1 || l.foldRight((0, 0, 0))(Count('Y')('B'))._2 > 1 )
        println("FALSE")
      else
        println("TRUE")
    }

  }

}
