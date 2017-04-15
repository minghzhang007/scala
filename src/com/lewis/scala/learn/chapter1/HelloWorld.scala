package com.lewis.scala.learn.chapter1

/**
  * Created by zmh46712 on 2017/4/15.
  */
class HelloWorld {
  private var privateValue1 = "Hello"
  var value2 = "World"

  def add={println(privateValue1+value2)}

  def plus(m:Char)=value2+m;

  def value1=privateValue1;

  def value1_(newValue1:String) ={
    if (newValue1.length > privateValue1.length) privateValue1 = newValue1
  }

  def main(args: Array[String]) {

  }

}
