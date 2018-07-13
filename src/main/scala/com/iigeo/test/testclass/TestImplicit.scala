package com.iigeo.test.testclass

class A{}

class RichA(a:A){
  def rich()={
    println("rich........")
  }
}


/**
  *
  * 隐式类/隐式转换/隐式参数
  */
object TestImplicit {

  def main(args: Array[String]): Unit = {
    //1.隐式参数
    implicit val ratename=2.3
    implicit val name="implicit"
    //编译器会查找是否已声明了隐式参数，有的话直接调用，否则报错
    cacl(2)

    //2.隐式转换,将A类转换为RichA类
    implicit  def AtoRich(a:A)=new RichA(a)
    val a=new A
    a.rich()

    //3.隐式类
    implicit class Calcult(x:Int){
      def add_10(a:Int):Int=a+x
    }

    println("隐式类调用："+5.add_10(3))

  }

  def cacl(double:Double)(implicit rate:Double)={
         println(double*rate)
  }
}
