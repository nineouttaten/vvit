package Tasks

import scala.annotation.tailrec
import scala.io.StdIn.readLine

object Task30 extends App{
  val n: Int = readLine("Введите исходное число n: ").toInt
  def summator(n: Int): Int = {
    @tailrec
    def loop(k: Int, number: Int, acc: Int = 0): Int = {
      if (k == 0) acc else loop(k - 1, number / 10, acc + number % 10)
    }
    loop(n.toString.length, n)
  }
  def isPower(a: Int, b: Int): Boolean = {
    @tailrec
    def loop(n: Int): Boolean = {
      if (math.pow(a, n).toInt > b) false
      else if (math.pow(a, n).toInt == b) true
      else loop (n + 1)
    }
    loop(2)
  }
  @tailrec
  def biggest(n: Int): Int = {
    if (isPower(summator(n), n)) n else biggest(n - 1)
  }
  println(biggest(n))
}

