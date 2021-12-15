package Tasks

import scala.annotation.tailrec
import scala.io.StdIn.readLine
object Task28 extends App{
  val n: Int = readLine("Введите n: ").toInt
  def summator(n: Int): Int = {
    @tailrec
    def loop(number: Int, acc: Int = 0): Int = {
      if (number > math.sqrt(n)) acc
      else if (n % number == 0) loop(number + 1, acc + number + n / number)
      else loop(number + 1, acc)
    }
    loop(1) - n
  }
  @tailrec
  def biggest(n: Int): Int = {
    if (n == summator(n)) n else biggest(n - 1)
  }
  println(biggest(n))
}

