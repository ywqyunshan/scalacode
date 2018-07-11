package com.iigeo.test.testclass

/**
  * 定义私有类
  */
class MyApplyClass private {
  var count=1
  def incr={
    count=count+1
    println(count)
  }
}

object MyApplyClass{
  def apply(): MyApplyClass = new MyApplyClass()
}


/**
  * 测试伴生对象
  */
object TestApply {
  def main(args: Array[String]): Unit = {
    val myApplyClass=MyApplyClass()
    myApplyClass.incr
  }
}
