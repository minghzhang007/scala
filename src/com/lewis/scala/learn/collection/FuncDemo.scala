package com.lewis.scala.learn.collection

/**
  * Created by zmh46712 on 2017/4/22.
  */
object FuncDemo {
  def main(args: Array[String]) {

    val left: Int = (1 to 10).reduceLeft(_ - _)
    println(left)
    val left1: Int = (1 to 10).reduceLeft(_ + _)
    println(left1)

    val left2: Int = (1 to 10).foldLeft(0)(_ + _)
    println(left2)

    val left3: Int = (1 to 10).foldLeft(0)(_ - _)
    println(left3)

    val i: Int = (0 /: (1 to 10)) (_ - _)
    println(i)

    val freq = scala.collection.mutable.Map[Char, Int]()
    for (c <- "Mississippi") freq(c) = freq.getOrElse(c, 0) + 1
    println(freq)

    val prices = List(5.0,20.0,9.95)
    val quantities = List(10,2,1)
    val zip: List[(Double, Int)] = prices.zip(quantities)
    val map: List[Double] = zip.map(p => p._1 * p._2)
    println(zip)
    println(map)

    for(i <- (1 to 100) .par) print(i+" ")
  }
}
