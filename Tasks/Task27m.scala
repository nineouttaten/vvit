package Tasks

import scala.annotation.tailrec
import scala.io.StdIn.readLine

object Task27m extends App{
  val Arr: Array[Any] = Array(1, 2, 3, 4, 5)
  val k: Int = readLine("Введите количество сдвигов: ").toInt
  def leftShift(Arr: Array[Any]): Array[Any] ={
    val last: Any = Arr(Arr.size - 1)
    Arr(Arr.size - 1) = Arr(0)

    def loop(arr: Array[Any], i: Int): Array[Any] ={
      if (i >= arr.size - 1)
        return arr
      else
        arr(i - 1) = arr(i)
        loop(arr, i + 1)
    }
    val newArr: Array[Any] = loop(Arr, 1)
    newArr(Arr.size - 2) = last
    newArr
  }

  def rightShift(Arr: Array[Any]): Array[Any] ={
    val first: Any = Arr(0)
    Arr(0) = Arr(Arr.size - 1)

    def loop(arr: Array[Any], i: Int): Array[Any] ={
      if (i <= 1)
        return arr
      else
        arr(i) = arr(i - 1)
      loop(arr, i - 1)
    }
    val newArr: Array[Any] = loop(Arr, Arr.size - 1)
    newArr(1) = first
    newArr
  }

  def loopLeftShift(Arr: Array[Any], k: Int): Array[Any] ={
    if (k == 0) Arr else loopLeftShift(leftShift(Arr), k - 1)
  }

  def loopRightShift(Arr: Array[Any], k: Int): Array[Any] ={
    if (k == 0) Arr else loopRightShift(rightShift(Arr), k - 1)
  }

  if (k > 0) println(loopLeftShift(Arr, k).mkString(" ")) else println(loopRightShift(Arr, k * -1).mkString(" "))


}
