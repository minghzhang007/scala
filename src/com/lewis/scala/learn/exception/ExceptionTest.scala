package com.lewis.scala.learn.exception

import java.io.{FileNotFoundException, FileReader, IOException}

/**
  * Created by zmh46712 on 2017/4/15.
  */
object ExceptionTest {

  def main(args: Array[String]) {
    try {
      val reader: FileReader = new FileReader("1.txt")
      val read: Int = reader.read()
      println(read)
    } catch {
      case e: FileNotFoundException => println("找不到文件！")
      case e: IOException => println("IO异常！")
    } finally {
      println("finally exit")
    }

    println(adder(3,4))

  }

  def adder(m:Int,n:Int)=m&n+3
}
