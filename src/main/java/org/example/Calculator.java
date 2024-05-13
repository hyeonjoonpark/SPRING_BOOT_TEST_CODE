package org.example;

import org.example.calculate.AdditionOperator;
import org.example.calculate.DivisionOperator;
import org.example.calculate.MultiplicationOperator;
import org.example.calculate.SubtractionOperator;

import java.util.List;

public class Calculator {

  private static final List<NewArithmeticOperator> arithmeticOperators = List.of(
    new AdditionOperator(),
    new SubtractionOperator(),
    new MultiplicationOperator(),
    new DivisionOperator()
  );

  public static int calculate(int operand1, String operator, int operand2, int result) {
    return arithmeticOperators
      .stream()
      .filter(
        arithmeticOperator -> arithmeticOperator.supports(operator)
      )
      .map(arithmeticOperator -> arithmeticOperator.calculate(operand1, operand2))
      .findFirst()
      .orElseThrow(
        () -> new IllegalArgumentException("올바른 사칙연산이 아닙니다")
      );
  }
}
