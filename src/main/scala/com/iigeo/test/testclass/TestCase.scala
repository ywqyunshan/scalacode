package com.iigeo.test.testclass

/**
  * 样本类形参默认是val常量
  * 默认利用apply实现了伴生对象和构造函数
  * 默认实现了== ，equals等方法
  * @param name
  * @param number
  */
case class Book(name:String,number: Number){
  val author:String=""
}
/**
  * 样本类测试
  */
object TestCase {
  def main(args: Array[String]): Unit = {
    val book=Book("iigeo",3)

    val book1=Book("iigeo",4)
    val isbook=book match {
      case Book(name,number)=>"this is book"
      case _=>"no book"
    }

    println(isbook)
    println(book==book1)

  }

}
