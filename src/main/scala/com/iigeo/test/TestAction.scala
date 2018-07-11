package com.iigeo.test

/**
  *
  * 常用算子操作
  *
  */
object TestAction {

  def main(args: Array[String]): Unit = {
    val list1=List(2,4,6)
    val list2=List(11,3,5,3)
    //集合合并
    val listcollection=List(list1,list2).flatten
    val listzip=list1.zip(list2)
    println(listcollection)
    println(listzip)
    // ((2-4)-6)
    val reduce=list1.reduce((x,y)=>x-y)
    // ((2-4)-6)
    val reduceleft=list1.reduceLeft(_-_)
    // (2-(4-6))
    val reduceRight=list1.reduceRight(_-_)
    //((1-2-4)-6)
    val foldleft=list1.foldLeft(1)(_-_)
    //((2-(4-(6-1)))
    val foldright=list1.foldRight(1)(_-_)

    val sort=list2.sortWith((x,y)=>x<y)
    println(reduce)
    println(reduceleft)
    println(reduceRight)
    println(foldleft)
    println(foldright)
    println(sort)
  }

}
