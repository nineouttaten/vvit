package Tasks

import scala.annotation.tailrec

object Task12 extends App{
  def countdown(n: Int): Unit = {
    @tailrec
    def loop(n: Int): Unit = {
      if (n >= 0) {println(n); loop(n - 1)}
    }
    loop(n)
  }
  countdown(8)
}

