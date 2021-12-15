package Tasks

import scala.annotation.tailrec
import scala.io.StdIn.readLine
object Task26 extends App{
  val n: Int = readLine("Введите n: ").toInt
  val k: Int = readLine("Введите k: ").toInt
  
  def accomodation(n: Int, k: Int): Int = {
    val stop: Int = n - (k - 1)
    @tailrec
    def loop(n: Int, acc: Int = 1): Int = {
      if (n < stop) acc
      else loop(n - 1, acc * n)
    }
    loop(n)
  }
  println(accomodation(n, k))
}

