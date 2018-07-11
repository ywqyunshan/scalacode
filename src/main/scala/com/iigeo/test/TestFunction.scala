package com.iigeo.test

/**
  * scala 函数使用
  */
object TestFunction {


  //函数1——>正常函数,未声明返回值,默认会做类型推断
  def func1(x:Int,y:Int)=x+y

  //函数2——>声明返回值
  def func2(name:String):String={
     name
  }

  //函数3——>匿名函数
  def func3=(x:Int,y:Int)=>x+y

  //函数4——>函数参数初始化默认值
  def func4(x:Int=3)=x

  //函数5——>传入多个参数的简化(写法可变长度参数)
  def func5(name:String *)={
    name.foreach(x=>print(x))
  }

  //函数6——>柯里化函数
  def func6(x:Int)(y:Int)=x+y



  def main(args: Array[String]): Unit = {
    println("func1:"+func1(2,3))
    println("func2:"+func2("suzhou"))
    println("func3:"+func3(2,5))
    println("func4:"+func4(5))
    func5("a","b")
    //偏应用函数——> _通配符使用，将原函数中的某个参数固定，抽象为一个新的函数，方便重复使用
    val partail=func1(2,_:Int)
    println("func1-partail:"+partail(6))
    //柯里化应用
    val fc=func6(3)_
    println("func6:"+fc(19))

  }

}
