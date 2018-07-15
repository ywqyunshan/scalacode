package com.iigeo.test.sort

/**
  * 排序
  */
object TestSort {

  def main(args: Array[String]): Unit = {
    val list=List(4,8,20,2,1,80)
    val sortlist=qSort(list)
    sortlist.foreach(x=>print(" "+x))
  }

  /**
    * 快速排序
    * @param list
    * @return
    */
  def qSort(list:List[Int]):List[Int]=list match {
    case Nil=>Nil
    case List()=>List()
    case head::tail=>{
      val (left,right)=tail.partition(_<head)
      qSort(left):::head::qSort(right)
    }
  }

}
