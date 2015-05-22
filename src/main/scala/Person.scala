
class Person {
  var name: String = _ 
  val age: Int = _ 

  def this(name: String, age: Int) = {
    this
    this.name = name
    this.age = age
  }

  override def toString = "name: " + name + "," + "age: " + age

  override def hashCode = name.hashCode + age.hashCode
}

object Person {
  def apply(name: String, age: Int) = new Person(name, age)

  def run = "everyone can run"
}