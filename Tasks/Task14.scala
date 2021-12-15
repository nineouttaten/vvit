package Tasks

object Task14 extends App{
  def product(s: String): Long = {
    s.map(_.toLong).product
  }
  println(product("Hello"))
}