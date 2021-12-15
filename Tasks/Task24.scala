package Tasks

object Task24 extends App{
  def gcd(a: Long, b: Long): Long ={
    if (b == 0) a
    else gcd(b, a % b)
  }

  def lcm(a: Long, b: Long): Long ={
    a / gcd(a,b) * b
  }
  println(gcd(5, 12))
  println(lcm(5, 12))
}