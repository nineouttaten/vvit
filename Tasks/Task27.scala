package Tasks

import scala.io.StdIn.readLine

object Task27 extends App{
  val Arr: List[Any] = List(1, 2, 3, 4, 5)
  val k: Int = readLine("Введите количество сдвигов: ").toInt
  def leftShift(A: List[Any]): List[Any] = {
    A.takeRight(A.length - k) ++ A.take(k)
  }
  def rightShift(A: List[Any]): List[Any] = {
    A.takeRight(-k) ++ A.take(A.length + k)
  }
  if (k > 0) println(leftShift(Arr))
  else println(rightShift(Arr))
}


