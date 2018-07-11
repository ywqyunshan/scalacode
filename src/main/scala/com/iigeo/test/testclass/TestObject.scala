package com.iigeo.test.testclass

/**
  * 类的唯一单例对象，scala没有static关键字，用单例对象实现静态方法,静态变量
  */
object MyObject{

  def static1={
    println("I am static1")
  }

  def static2={
    println("I am static2")
  }

  val count=1;

}

object TestObject {
  def main(args: Array[String]): Unit = {
    MyObject.static1
    println(MyObject.count)
  }

}
