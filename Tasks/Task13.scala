package Tasks

object Task13 extends App{
  var p: Long = 1
  val s = "Hello"
  for(char <- s){p *= char.toInt}
  println(p)
}

