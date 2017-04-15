package com.lewis.scala.learn.chapter1

/**
  * Created by zmh46712 on 2017/4/15.
  */
object Hello {

  def sayHello(name:String)={
    print("hello "+name)
  }

  def main(args: Array[String]) {
    val hello: HelloWorld = new HelloWorld
    hello.value1_("hi,Hello")
    hello.add
  }
}
