```scala
class MyClass[T](val value: T) {
  def myMethod(x: T): T = {
    // Some code that processes x
    x
  }
}

val myInstance = new MyClass(10) // Integer type
val result1 = myInstance.myMethod(20) // Ok

val myInstance2 = new MyClass("Hello") // String type
val result2 = myInstance2.myMethod("World") // Ok, now using a String

//Alternative Solution:
class MyClass2[T](val value: T) {
  def myMethod[U](x: U)(implicit ev: T =:= U ): T = {
    x //Type erasure is handled here with implicit evidence
  }
}
val myInstance3 = new MyClass2(10) 
val result3 = myInstance3.myMethod(20) // Ok
val myInstance4 = new MyClass2("Hello") // String type
val result4 = myInstance4.myMethod(25) // throws ClassCastException at runtime because of implicit conversion
```