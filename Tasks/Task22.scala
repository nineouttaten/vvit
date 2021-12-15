package Tasks

import scala.annotation.tailrec
import scala.io.StdIn.readLine

object Task22 extends App{
  val n: Int = readLine("Введите n: ").toInt

  def isSimple(i: Int): Boolean = {

    def isSimpleHelper(i: Int, j: Int, sum: Int): Boolean ={
      if (j == 0 && sum == 2)
        true
      else if (j == 0 && sum != 2)
        false
      else if (i % j == 0) isSimpleHelper(i, j - 1, sum + 1)
      else isSimpleHelper(i, j - 1, sum)
    }

    isSimpleHelper(i, i, 0)
  }

  def isDivider(i: Int, j: Int): Boolean = {
    if (i % j == 0) true
    else false
  }

  def findSimpleDivider(i: Int): Int = {
    @tailrec
    def loop(i: Int, j: Int): Int = {
      if (isDivider(i, j) && isSimple(j)) j else loop(i, j-1)
    }

    loop(i, i)
  }

  def sumOfDigits(i: Int): Int = {
    @tailrec
    def loop(i: Int, sum: Int): Int = {
      if (i == 0) sum else loop(i / 10, sum + i % 10)
    }

    loop(i, 0)
  }
  println("Сумма цифр наибольшего простого делителя: " + sumOfDigits(findSimpleDivider(n)).toString)
}