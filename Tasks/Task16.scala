package Tasks

import scala.annotation.tailrec

object Task16 extends App{
  def product(s: String): Long = {
    @tailrec
    def loop(i: Int, prod: Long = 1): Long = {
      if (i > 0) loop (i - 1, prod * s.charAt(i - 1).toLong) else prod
    }
    loop(s.length)
  }
  println(product("Hello"))
}


