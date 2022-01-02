package com.harikrishna

object Example05 {
  def main(args: Array[String]): Unit = {
    println(additionWay1(10, 20))
    // println(add(number1=1, number2=2))
    println(additionWay2(1, 2))
    println(additionWay3(5, 6))

    fixedVariableCannotBeChanged
    callMe
  }

  def additionWay1(num1: Int, num2: Int): Int = num1 + num2

  def additionWay2(number1: Int, number2: Int): Int = {
    return number1 + number2;
  }

  def additionWay3(number1: Int, number2: Int): Int = {
    var sum: Int = number1 + number2;
    return sum;
  }

  private def fixedVariableCannotBeChanged = {
    val myVal: String = "Foo"
    // myVal = "df"
  }

  def callMe = {
    var myVar: Int = 10;
    val myVal: String = "Hello Scala with datatype declaration.";
    var myVar1 = 20;
    val myVal1 = "Hello Scala new without datatype declaration.";

    println(myVar);
    println(myVal);
    println(myVar1);
    println(myVal1);
  }
}