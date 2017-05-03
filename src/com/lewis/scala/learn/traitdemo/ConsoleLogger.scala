package com.lewis.scala.learn.traitdemo

/**
  * Created by zmh46712 on 2017/4/20.
  */
class ConsoleLogger extends Logger{

  override def log(msg: String): Unit = println(msg)
}
