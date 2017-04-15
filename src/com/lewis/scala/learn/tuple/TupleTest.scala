package com.lewis.scala.learn.tuple

/**
  * Created by zmh46712 on 2017/4/15.
  */
object TupleTest {
  def main(args: Array[String]) {
    val nums = Array(1, 2, 3, 4);
    val letters =Array("a", "b", "c", "d","e")
    val xiaowang =(1001,"xiaowang",85,23,"singing")
    val xiaoli =(1002,"xiaoli",90,21,"dancing")
    println(xiaoli._5)
   val toMap: Map[String, Int] = letters.zip(nums).toMap
    println(toMap)
  }
}
