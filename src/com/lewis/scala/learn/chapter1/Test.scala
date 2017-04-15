package com.lewis.scala.learn.chapter1

import com.lewis.scala.learn.classAndobject.Point

/**
  * Created by zmh46712 on 2017/4/15.
  */
object Test {
  def main(args: Array[String]) {
    val tomcat: Animal = new Animal(1,"female","tomcat")
    val point: Point = new Point(10,10)
    point.move(20,5)
  }
}
