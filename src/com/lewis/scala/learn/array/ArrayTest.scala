package com.lewis.scala.learn.array

import scala.collection.mutable
import scala.collection.mutable.ArrayBuffer

/**
  * Created by zmh46712 on 2017/4/15.
  */
object ArrayTest {
  def main(args: Array[String]) {
    val names: Array[String] = new Array[String](10)
    for (i <- 0 until   10)
      names(i)="name_"+i
    println(names)

    val nameBuffer: mutable.Buffer[String] = names.toBuffer
    println(nameBuffer)

    val buffer: ArrayBuffer[Int] = new ArrayBuffer[Int]()
    for (i <- 1 to 10)
      buffer += i
    println(buffer)
    buffer +=20
    buffer +=20
    buffer +=20
    println(buffer)
    buffer.trimEnd(2)
    println(buffer)

    for (i <- nameBuffer)
      print(i+" | ")
    println()
    for (i <- 0 until  nameBuffer.length)
      print(nameBuffer(i)+" || ")
    println
    for (i <- 0 to (names.length-1,2))
      print(names(i) +" ||| ")
    println
    for (i <- (0 until  names.length).reverse)
      print(names(i)+" ")
  }
}
