package com.lewis.scala.learn.collection

/**
  * Created by zmh46712 on 2017/4/15.
  */
object ListTest {

  def main(args: Array[String]) {

    //字符串列表
    val site: List[String] = List("google", "baidu", "sogou")
    //整形列表
    val nums: List[Int] = List(1, 2, 3, 4)
    //空列表
    val empty: List[Nothing] = List()

    //二维列表
    val dim: List[List[Int]] =
      List(
        List(1, 0, 0),
        List(0, 1, 0),
        List(0, 0, 1)
      )

    println("第一个网站："+site.head)
    println("最后一个网站："+site.tail)
    println("site 是否为空："+site.isEmpty)
    println("empty 是否为空："+empty.isEmpty)

    //使用 ::: 运算符或 List.:::() 方法或 List.concat() 方法来连接两个或多个列表
    val books = "函数式编程思想"::("scala并发编程"::("快学scala"::Nil))
    println("books:"+books)
    println("site:"+site)
    val s1 = books:::site
    println("books:::site ="+s1)
    val s2 = books.:::(site)
    println("books.:::(site) ="+s2)
    val s3 = List.concat(books,site)
    println("List.concat(books,site) ="+s3)

    // List.fill() 方法来创建一个指定重复数量的元素列表
    val happy: List[String] = List.fill(3)("happy !")
    println(happy)

    //ist.tabulate() 方法是通过给定的函数来创建列表。
    //方法的第一个参数为元素的数量，可以是二维的，第二个参数为指定的函数，我们通过指定的函数计算结果并返回值插入到列表中，起始值为 0
    val squares: List[Int] = List.tabulate(6)(n => n*n)
    println(squares)

    val mul: List[List[Int]] = List.tabulate(4,5)(_*_)
    println(mul)

    //List.reverse 用于将列表的顺序反转
    println("books 翻转前："+books)
    println("books 翻转后："+books.reverse)

    val y = "java1.8" +:books
    println(y)
  }


}
