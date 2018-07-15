package com.iigeo.test.find

import scala.util.Sorting

/**
  * 二分法查找
  */
object BinarySearch {

  def main(args: Array[String]): Unit = {
    var array=Array(2,4,7,3,88,2,1,7)
    //1.先排序
    val arraySort=array.sortWith(_<_)
    println(arraySort.head)
    //2.折半查询
    println(binarySearch(arraySort,7))
    println(binarySearch(arraySort,99))

    println(binaryByRec(arraySort,0,arraySort.length-1,7))

  }

  /**
    * 循环
    * @param array
    * @param k
    * @return
    */
  def binarySearch(array: Array[Int],k:Int):Int={
    var start=0
    var end=array.length-1
    while (start<=end){
      //获取中间值
      val middle=start+(end-start)/2
      val middleVaule=array(middle)
      k match {
        case _ if k>middleVaule=> start=middle+1
        case _ if k<middleVaule=> end=middle-1
        case _ if k==middleVaule=> return middle
      }
    }
    return -1
  }

  /**
    * 递归查询
    * @param array
    * @param k
    * @return
    */

  def binaryByRec(array: Array[Int],start:Int,end:Int,k:Int):Option[Int]={
    val middle=start+(end-start)/2
    val middleVaule=array(middle)
    k match {
      case _ if start>end =>None
      case _ if k>middleVaule =>binaryByRec(array,middle+1,end,k)
      case _ if k<middleVaule=>binaryByRec(array,start,middle-1,k)
      case _ if k==middleVaule=> Some(middle)
    }
  }

}
