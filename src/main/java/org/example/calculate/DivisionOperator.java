package org.example.calculate;

import org.example.NewArithmeticOperator;

public class DivisionOperator implements NewArithmeticOperator {
  @Override
  public boolean supports(String operator) {
    return "/".equals(operator);
  }

  @Override
  public int calculate(PositiveNumber operand1, PositiveNumber operand2) {
    if (operand2.toInteger() == 0){
      throw new IllegalArgumentException("0으로 나눌 수 없습니다");
    }
    return operand1.toInteger() / operand2.toInteger();
  }
}
