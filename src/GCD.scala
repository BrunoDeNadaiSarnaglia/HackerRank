/**
  * Created by Bruno on 10/19/2016.
  */
class GCD {
  def gcd(x: Int, y: Int): Int =
  {
    if(y == 0)
      x
    else
      gcd(y, x % y)
  }
}
