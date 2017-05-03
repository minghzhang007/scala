package com.lewis.scala.learn

import java.util.function.Predicate

import scala.beans.BeanProperty


/**
  * Created by Administrator on 2017/4/17.
  */
class Point(xc: Int, yc: Int) extends Equal {
  @BeanProperty var x: Int = xc
  @BeanProperty var y: Int = yc

  override def isEqual(obj: Any): Boolean =
    obj.isInstanceOf[Point] && obj.asInstanceOf[Point].x == x

}
