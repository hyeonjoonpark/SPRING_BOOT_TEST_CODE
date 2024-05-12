package org.example;

public class Calculator {

//    if ("+".equals(operator)) {
//      return operand1 + operand2;
//    } else if ("-".equals(operator)) {
//      return operand1 - operand2;
//    } else if ("*".equals(operator)) {
//      return operand1 * operand2;
//    } else if ("/".equals(operator)) {
//      return operand1 / operand2;
//    }

  public static int calculate(int operand1, String operator, int operand2, int result) {
    return ArithmeticOperator.calculate(operand1, operator, operand2);
  }
}
