package com.lewis.scala.learn.loop

/**
  * Created by zmh46712 on 2017/4/15.
  */
object LoopTest {
  def main(args: Array[String]) {
    println(sum2(5))
    println(forLoop(3, 4))
  }


  def sum(x: Int): Int = {
    var i = 1;
    var sum = 0;
    while (i <= x) {
      sum = sum + i;
      i = i + 1
    }
    sum
  }

  def sum2(x: Int): Int = {
    var sum = 0;
    for (i <- 1 to x) {
      sum = sum + i;
    }
    sum
  }

  def forLoop(x: Int, y: Int) :String={
    var s="";
    for (i <- 1 to x; j <- 1 to y) {
      s = s.concat(i * 10 + j + "\n")
    }
    s
  }

}
