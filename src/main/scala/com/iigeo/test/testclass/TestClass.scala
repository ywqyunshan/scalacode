package com.iigeo.test.testclass

//声明类 scala 类默认实现了getter和setter方法
class IIgeo1{
  val age=10 //默认实现了该字段的getter方法
  var name:String=_ //默认实现了该字段的getter/setter方法

}

//声明带构造函数的类,注意如果参数，不声明为val或者var，则是内部变量无法调用
class IIgeo2(val age:Int,var name:String){

  var genner:String=_
  //附属构造函数，类似于Java重载
  def this(age:Int,name:String,genner:String){
    this(age,name)
    this.genner=genner;
  }

}


object TestClass {

  def main(args: Array[String]): Unit = {
    //
    val iigeo=new IIgeo1
    println(iigeo.name)
    iigeo.name="suzhou"
    println(iigeo.name+":"+iigeo.age)

    val iIgeo2=new IIgeo2(12,"xiaoyang")
    println(iIgeo2.name+":"+iIgeo2.genner)

  }

}
