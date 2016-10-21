/**
  * Created by Bruno on 10/20/2016.
  */
class FullColors {

  def main(args : Array[String]): Unit = {
    for (i <- 1 to readInt()){
      val l = readLine().toList
      if(l.count(_ == 'R') != l.count(_ == 'G'))
        println("FALSE")
      else if(l.count(_ == 'Y') != l.count(_ == 'B'))
        println("FALSE")
      else if(l.foldRight((0, 0, 0))(
        (_1, _2) =>
          if(_1 == 'R')
            (_2._1, Math .max(_2._2, _2._3 + 1), _2._3 + 1)
          else if(_1 == 'G')
            (Math.min(_2._1, _2._3 - 1), _2._2, _2._3 - 1)
          else
            _2
      )._1 < - 1 || l.foldRight((0, 0, 0))(
        (_1, _2) =>
          if(_1 == 'R')
            (_2._1, Math .max(_2._2, _2._3 + 1), _2._3 + 1)
          else if(_1 == 'G')
            (Math.min(_2._1, _2._3 - 1), _2._2, _2._3 - 1)
          else
            _2
      )._2 > 1 )
        println("FALSE")
      else if(l.foldRight((0, 0, 0))(
        (_1, _2) =>
          if(_1 == 'Y')
            (_2._1, Math .max(_2._2, _2._3 + 1), _2._3 + 1)
          else if(_1 == 'B')
            (Math.min(_2._1, _2._3 - 1), _2._2, _2._3 - 1)
          else
            _2
      )._1 < - 1 || l.foldRight((0, 0, 0))(
        (_1, _2) =>
          if(_1 == 'Y')
            (_2._1, Math .max(_2._2, _2._3 + 1), _2._3 + 1)
          else if(_1 == 'B')
            (Math.min(_2._1, _2._3 - 1), _2._2, _2._3 - 1)
          else
            _2
      )._2 > 1 )
        println("FALSE")
      else
        println("TRUE")
    }

  }

}
