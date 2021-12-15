package Tasks

import scala.annotation.tailrec
import scala.io.StdIn.readLine

object Task25 extends App{
  val Arr: Array[Any] = Array(1, 2, 3, 4, 5)
  val k: Int = readLine("Введите частоту удаления: ").toInt
  def delete(arr: Array[Any]): String = {
    @tailrec
    def loop(n: Int, array: Array[Any]): Array[Any] = {
      if (n <= 0) array
      else if ((n) % k != 0) loop(n - 1, array :+ arr(n - 1))
      else loop(n - 1, array)
    }
    loop(arr.length, array = Array()).reverse.mkString(" ")
  }
  println(delete(Arr))
}




