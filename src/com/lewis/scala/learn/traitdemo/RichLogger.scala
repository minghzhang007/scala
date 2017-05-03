package com.lewis.scala.learn.traitdemo

/**
  * Created by zmh46712 on 2017/4/20.
  */
trait RichLogger extends Logger{
   override def log(msg:String)=println("[richLogger]:"+msg)
}
