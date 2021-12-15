package Tasks

object Task19 extends App{
  val arr: List[Any] = List(List(List(1, 1), 2, List(3, List(5, 8))))
  val arrOfNumbers: List[Int] = List()
  val number: Int = 1
  def findNumbers(Arr: List[Any], i: Int, arrOfNumbers: List[Int]): List[Int] ={
    if (i == Arr.size) {
      arrOfNumbers
    } else {
      if (Arr(i).isInstanceOf[Int]) {
        println(Arr(i).asInstanceOf[Int])
        findNumbers(Arr, i + 1, arrOfNumbers :+ Arr(i).asInstanceOf[Int])
      }
      else {
        findNumbers(Arr(i).asInstanceOf[List[Any]], 0, arrOfNumbers)
        findNumbers(Arr, i + 1, arrOfNumbers)
      }
    }
  }
  findNumbers(arr, 0, arrOfNumbers)
}
