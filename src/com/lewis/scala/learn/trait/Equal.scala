package com.lewis.scala.learn



/**
  * Created by Administrator on 2017/4/17.
  */
trait Equal {

  def isEqual(x: Any): Boolean

  def isNotEqual(x: Any): Boolean = !isEqual(x)

}


