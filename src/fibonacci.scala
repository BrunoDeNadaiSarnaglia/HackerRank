/**
  * Created by Bruno on 10/19/2016.
  */
class fibonacci {


  def fibonacci(x:Int):Int = {
    if(x == 1)
      0
    else if (x == 2)
      1
    else
      fibonacci(x - 1) + fibonacci(x - 2)
  }
}
