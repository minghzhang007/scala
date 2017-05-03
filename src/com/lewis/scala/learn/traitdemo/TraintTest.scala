package com.lewis.scala.learn.traitdemo

/**
  * Created by zmh46712 on 2017/4/20.
  */
object TraintTest {
  def main(args: Array[String]) {
    val logger: ConsoleLogger = new ConsoleLogger
    logger.log("hello ! my name is lewis !")

    val logger1 = new ConsoleLogger with RichLogger
    logger1.log("hello ! my name is lewis !")
  }
}
