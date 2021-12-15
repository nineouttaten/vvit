package Tasks

import scala.annotation.tailrec
import scala.io.StdIn.readLine
object Task18 extends App{
  val m: Int = readLine("Введите m: ").toInt
  val n: Int = readLine("Введите n: ").toInt
  def hasSimilar(x: Int): Boolean = {
  val l: Int = x.toString.length
    @tailrec
    def loop(x: Int, acc: Set[Int] =  Set()): Boolean ={
      if (x <= 0) acc.size != l
      else loop(x / 10, acc + x % 10)
    }
    loop(x)
  }
  def f(m: Int, n: Int): Int = {
    @tailrec
    def loop(k: Int, acc: Int = 0): Int = {
      if (k > n) acc
      else if (!hasSimilar(k)) loop(k + 1, acc + k)
      else loop(k + 1, acc)
    }
    loop(m)
  }
  println(f(m, n))
}



