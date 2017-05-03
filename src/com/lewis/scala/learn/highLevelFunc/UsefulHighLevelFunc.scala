package com.lewis.scala.learn.highLevelFunc

import scala.collection.immutable.IndexedSeq

/**
  * Created by zmh46712 on 2017/4/21.
  */
object UsefulHighLevelFunc {

  def main(args: Array[String]) {
    val map: IndexedSeq[Int] = (1 to 9).map(10 * _)
    println(map)
    val map1: IndexedSeq[String] = (1 to 9).map("=" * _)
    println(map1)
  }
}
