package com.lewis.scala.learn.ifelse

/**
  * Created by zmh46712 on 2017/4/15.
  */
object IfElseTest {

  def main(args: Array[String]) = {
    val level = getLevel(101)
    println(level)
    println(min(20, 19))
    println(max(20, 29))
    for (i <- 0 to 10)
      println(weekDayDesc(i))

  }

  def getLevel(score: Int): String = {
    if (score < 60) "F"
    else if (score < 70) "D"
    else if (score < 80) "C"
    else if (score < 90) "B"
    else if (score <= 100) "A"
    else "illegal input"
  }

  def min(x: Int, y: Int) = {
    var min = x;
    if (x > y) min = y
    min
  }

  def max(x: Int, y: Int) = if (x >= y) x else y

  def weekDayDesc(x: Int) =
    x match {
      case 0 => "星期天"
      case 1 => "星期一"
      case 2 => "星期二"
      case 3 => "星期三"
      case 4 => "星期四"
      case 5 => "星期五"
      case 6 => "星期六"
      case _ => "illegal input"
    }


}
