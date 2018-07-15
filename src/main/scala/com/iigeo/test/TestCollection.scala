package com.iigeo.test

import java.util

/**
  * array可变，线程不安全
  * list 不可变，线程安全
  * Map
  * scala用Option处理返回的空值
  * Nothing是所有类型Any的子类型，处理所有Any返回的空类型
  * Null是所有AnyRef的子类型，处理引用类型的返回值,null是唯一实例
  * Nil对应List[Nothing]
  * None是Option的空标识
  */
object TestCollection {

  def main(args: Array[String]): Unit = {
    //定义数组
    val array=Array(1,2,3,6)
    //定义list-单链表
    var list=List(1,4,6,8)
    //定义元组-不同类型的数据组装
    val tump=(1,"iigeo")
    println(list)
    array(3)=10
    println(tump._1)
    val map=Map("a"->1,"b"->2,"c"->3)
    println(map.get("b"))
    println(map.get("b").getOrElse("None"))
    println(list.find(x=>x>8).getOrElse("None"))
    val addlist=1::4::list
    println(addlist)

  }

}
