package com.iigeo.test.testclass

/**
  * 抽象类
  */
abstract class IIgeoAbstract{
  //抽象方法，不需要加abstract关键字，只需要不写方法体
  def spark
  //抽象字段，不需要初始化
  val name:String
}

/**
  * 继承抽象类
  */
class IIgeoSubAbstract extends IIgeoAbstract{
   val name: String = "AAA"

   def spark: Unit = {
     println("Spark")
   }

}

object TestAbstractClass {

  def main(args: Array[String]): Unit = {
    val iIgeoAbstract=new IIgeoSubAbstract
    iIgeoAbstract.spark
    println(iIgeoAbstract.name)

  }

}
