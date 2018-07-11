package com.iigeo.test.testclass


/**
  * 特质1-实现了方法
  */
trait Looger1{
  def log(name:String): Unit ={
    println(name)
  }
}

/**
  * 特质2-类似于JAVA中的接口，未实现方法
  */

trait Looger2{
  def log2(name: String)
}

trait Looger3{
  def log3(name:String)
}

class TestLog1 extends  Looger1{
    def test(name: String): Unit = {
     log("override")
   }

  override def log(name: String): Unit = {
    println("testlog1:"+name)
  }


}

class TestTrait extends Looger1 with Looger2 with Looger3{
  override def log(name: String): Unit = {
    println("hello:"+name)
  }
  override def log2(name: String): Unit = {
    println("hello2:"+name)
  }
  override def log3(name: String): Unit = {
    println("hello3:"+name)
  }

}



/**
  * 特质
  */
object TestTrait {

  def main(args: Array[String]): Unit = {
    val testLog1=new TestLog1
    testLog1.test("nihao")

    val  testTrait =new TestTrait
    testTrait.log("suzhou")

  }

}
