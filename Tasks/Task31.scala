package Tasks

import scala.annotation.tailrec

object Task31 extends App{
  val Arr = List((1, "Привет"), (2, "Мир"), (3, "ого"))
  def lists(Arr: List[(Int, String)]): List[List[Any]] = {
    @tailrec
    def loop(n: Int, acc1: List[Int] = List(), acc2: List[String] = List()): List[List[Any]] = {
      if (n <= 0) List(acc1.reverse, acc2.reverse)
      else loop(n - 1, acc1 :+ Arr(n - 1)._1, acc2 :+ Arr(n - 1)._2)
    }
    loop(Arr.length)
  }
  println(lists(Arr))
}



