package com.lewis.scala.learn.zuoye

/**
  * Created by zmh46712 on 2017/4/15.
  */
object ZUOYe {

  def adder(m: Int, n: Int) = m & n + 3

  def min(m: Int, n: Int): Int = {
    var a = m + 1
    if (m > n) a = n + 1
    return a
  }

  def main(args: Array[String]) {
    val one = adder(5, 6)
    val two = adder(5, one)
    print("one:"+one)
    print("two:"+two)
    val three = min(one, two)
    println(three)
  }

}
