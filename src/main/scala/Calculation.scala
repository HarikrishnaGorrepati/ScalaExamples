package com.harikrishna

object Calculation {
  def main(args: Array[String]) {
    val math = new Math(10, 20)
    math.calc(40, 50);
  }
}

class Math(val num1: Int, val num2: Int) {
  var number1: Int = num1
  var number2: Int = num2

  def calc(dx: Int, dy: Int) {
    number1 = number1 + dx
    number2 = number2 + dy
    println("Point x location : " + number1);
    println("Point y location : " + number2);
  }
}