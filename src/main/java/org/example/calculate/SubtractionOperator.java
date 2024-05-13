package org.example.calculate;

import org.example.NewArithmeticOperator;

public class SubtractionOperator implements NewArithmeticOperator {
  @Override
  public boolean supports(String operator) {
    return "-".equals(operator);
  }

  @Override
  public int calculate(PositiveNumber operand1, PositiveNumber operand2) {
    return operand1.toInteger() - operand2.toInteger();
  }
}
