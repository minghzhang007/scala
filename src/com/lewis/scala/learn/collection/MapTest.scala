package com.lewis.scala.learn.collection

import scala.collection.mutable

/**
  * Created by zmh46712 on 2017/4/15.
  */
object MapTest {
  def main(args: Array[String]) {
    val weekdayMap = Map(1 -> "Monday", 2 -> "Tuesday", 3 -> "Wednesday", 4 -> "Thursday", 5 -> "Friday", 6 -> "Saturday", 0 -> "Sunday")
    for (i <- 0 until  7)
      println(weekdayMap(i))


    println(weekdayMap.get(2))
    println(weekdayMap.getOrElse(7,"输入不对！"))
    val bufferMap: mutable.Buffer[(Int, String)] = weekdayMap.toBuffer
    bufferMap += (8 -> "周八",9->"周九")

    println("keys:"+weekdayMap.keys)
    println("values:"+weekdayMap.values)
  }

}
