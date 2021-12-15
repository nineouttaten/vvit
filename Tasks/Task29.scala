package Tasks

import scala.annotation.tailrec

object Task29 extends App{
  val Arr: Array[Any] = Array(1, 2, 3, 4, 5)
  def lists(Arra: Array[Any]) = {
    @tailrec
    def loop(n: Int, acc1: Array[Any] = Array(), acc2: Array[Any] = Array()): Array[Any] = {
      if (n <= 0) Array(acc1.reverse.mkString(" "), acc2.reverse.mkString(" "))
      else if ((n - 1) % 2 == 0 ) loop(n - 1, acc1 :+ Arra(n - 1), acc2)
      else loop(n - 1, acc1, acc2 :+ Arra(n - 1))
    }
    loop(Arra.length)
  }
  println(lists(Arr).mkString("Array(", ", ", ")"))
}



