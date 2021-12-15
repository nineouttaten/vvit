package Tasks

object Task9 extends App{
  def signum(n: Int): Int = {
    if (n > 0) 1 else if (n < 0) -1 else 0
  }
  println(signum(-4))
  println(signum(0))
  println(signum(4))
}





