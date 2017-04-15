package com.lewis.scala.learn.classAndobject

/**
  * Created by zmh46712 on 2017/4/15.
  */
class Point(val xc: Int, val yc: Int) {
  var x: Int = xc
  var y: Int = yc

  def move(dx: Int, dy: Int) {
    x = x + dx
    y = y + dy
    println("x 的坐标点 : " + x);
    println("y 的坐标点 : " + y);
  }
}

class Location(override val xc: Int, override val yc: Int,
               val zc: Int) extends Point(xc, yc) {
  var z: Int = zc

  def move(dx: Int, dy: Int, dz: Int) {
    x = x + dx
    y = y + dy
    z = z + dz
    println("x 的坐标点 : " + x);
    println("y 的坐标点 : " + y);
    println("z 的坐标点 : " + z);
  }
}

class Person {
  var name = "";

  override def toString = getClass + "[name:" + name + "]"

}

class Employee extends Person {
  var salary = 0.0;

  override def toString() ={
    super.toString + "[salary:" + salary + "]"
  }
}


object DOTest {
  def main(args: Array[String]) {
    val loc = new Location(10, 20, 15);

    // 移到一个新的位置
    loc.move(10, 10, 5);

    val employee: Employee = new Employee
    employee.name = "lewis";
    employee.salary = 199999.85;
    println(employee.toString)
  }
}

