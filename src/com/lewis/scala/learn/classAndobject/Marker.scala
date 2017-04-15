package com.lewis.scala.learn.classAndobject

/**
  * Created by zmh46712 on 2017/4/15.
  */
class Marker private(val color: String) {
  println("created " + this)

  override def toString = "颜色标记：" + color
}

object Marker {

  private val markers: Map[String, Marker] = Map (
    "red" -> new Marker("red"),
    "blue" -> new Marker("blue"),
    "green" -> new Marker("green")
  )

  def apply(color:String)={
    if (markers.contains(color)) markers(color) else null
  }

  def getMarker(color:String)={
    if(markers.contains(color)) markers(color) else null
  }

  def main(args:Array[String])={
    println(Marker("red"))
    println(Marker getMarker "blue")
  }
}
