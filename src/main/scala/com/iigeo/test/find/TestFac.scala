package com.iigeo.test.find

object TestFac {

  def main(args: Array[String]): Unit = {
    fac(4)
  }

  def fac(n:Int):Int={
    if(n<=0)1
    else n * fac(n-1)
  }

}
