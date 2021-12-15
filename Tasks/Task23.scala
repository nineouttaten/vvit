package Tasks

import scala.annotation.tailrec
import scala.io.StdIn.readLine

object Task23 extends App {
  val Arr: Array[Int] = Array(1, 2, 3, 4)
  val k: Int = readLine("Введите k: ").toInt

  def copyPaste(x: Int) = {
    @tailrec
    def loop(n: Int, arr: Array[Any] = Array()): Array[Any] = {
      if (n <= 0) arr else loop(n - 1, arr :+ x)
    }

    loop(k)
  }

  def Element(Arr: Array[Int]): Array[Any] = {
    @tailrec
    def loop(n: Int, arr: Array[Any] = Array()): Array[Any] = {
      if (n <= 0) arr else loop(n - 1, arr ++ copyPaste(Arr(n - 1)))
    }

    loop(Arr.length)
  }

  println(Element(Arr).reverse.mkString(" "))
}
