package com.iigeo.test.find

/**
  * 二分法查找
  */
object BinarySearch {

  def main(args: Array[String]): Unit = {
    val array=Array(2,4,7,3,88,2,5,7)
    println(binarySearch(array,5))
    println(binarySearch(array,99))

  }

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

}
