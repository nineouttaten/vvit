package Tasks

object Task17 extends App{
  def xn(x: Int, n: Int): Double = {
    if (n == 0) 1
    else if (n > 0 & (n % 2 == 0)) x * n / 2
    else if (n > 0 & (n % 2 == 1)) x * x * n - 1
    else 1 / x - n
  }
  println(xn(6, 5))
}

