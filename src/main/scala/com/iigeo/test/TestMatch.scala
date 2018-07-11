package com.iigeo.test

/**
  * 模式匹配
  */
object TestMatch {

  def main(args: Array[String]): Unit = {
    val value=3
    //标准用法——值匹配
    val result=value match {
      case 1=>"one"
      case 2=>"two"
      case _=>"other"

    }
    println("标准匹配："+result)

    val result2=value match {
      case i if i==1 =>"one"
      case i if i==2 =>"two"
      case i if i==3=>"three"
    }

    println("守卫匹配："+result2)

    def anyMatch(obj:Any)= obj match {
      case x:Int=>"Int"
      case y:String=>"String"
      case _=>"unknow type"
    }
    println("匹配类型："+anyMatch(true))

  }

}
