package lab4

object Typeclasses {

  // a) Определите тайп-класс Reversable, который представляет в обратном порядке значения.

  trait Reversable[T]{def reverse(value:T):T}

  // b) Реализуйте функцию Reverse для String.
  object Reversable {
    def reverse[T: Reversable](a: T): T = implicitly[Reversable[T]].reverse(a)
    implicit object ReversableString extends Reversable[String]{
      def reverse(str:String):String=str.reverse
    }
  }
  // примените тайп-класс-решение из пункта (a) здесь
  def testReversableString(mystr: String): String = Reversable.reverse(mystr)

  // c) Определите тайп-класс Smash таким образом чтобы в нем была функция smash, которая выполняет операцию со значениями одного типа.

  trait Smash[T]{def smash(a: T, b: T): T}
  // d) Реализуйте  функции Smash для типа Int и Double.
  //    Используйте сложение для типа Int у умножение для типа Double.
  object Smash {
    def smash[T : Smash](a: T, b: T): T = implicitly[Smash[T]].smash(a,b)
    implicit object SmashInt extends Smash[Int]{
      def smash(value1:Int,value2:Int):Int = value1 + value2
    }
    implicit object SmashDouble extends Smash[Double]{
      def smash(value1:Double,value2:Double):Double = value1 * value2
    }
    // e) Реализуйте функцию Smash для типа String. Необходимо выполнить конкатенацию строк, которые будут получены в качестве параметра.
    implicit object SmashString extends Smash[String]{
      def smash(value1:String,value2:String):String=value1 + value2
    }
  }


  // примените тайп-класс-решение из пункта (d) здесь
  def testSmashInt(a: Int, b: Int): Int = Smash.smash(a,b)

  // примените тайп-класс-решение из пункта (d) здесь
  def testSmashDouble(a: Double, b: Double): Double = Smash.smash(a,b)

  // примените тайп-класс-решение из пункта (d) здесь
  def testSmashString(a: String, b: String): String = Smash.smash(a,b)

  def main(args:Array[String])={

    print("1. ")
    println(testReversableString("Bernadskiy Ilya"))
    print("2. ")
    println(testSmashInt(2,5))
    print("3. ")
    println(testSmashDouble(3,4))
    print("4. ")
    println(testSmashString("Bernadskiy ","Ilya"))
  }
}

