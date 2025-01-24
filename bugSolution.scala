```scala
class MyClass(val x: Int) {
  def myMethod(y: Int): Int = {
    x + y
  }
  def myMethodOption(y: Option[Int]): Int = {
    x + y.getOrElse(0) 
  }
}

object Main extends App {
  val obj = new MyClass(5)
  println(obj.myMethod(10)) // Works fine
  println(obj.myMethodOption(Some(10))) // Returns 15
  println(obj.myMethodOption(None)) // Returns 5 (handles the null case)
}
```