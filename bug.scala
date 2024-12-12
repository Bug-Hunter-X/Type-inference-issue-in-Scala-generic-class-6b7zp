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
val result2 = myInstance2.myMethod(25) // Compilation error!
```