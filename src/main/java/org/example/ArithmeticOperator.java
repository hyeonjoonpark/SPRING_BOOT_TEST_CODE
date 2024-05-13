package org.example;

import org.example.calculate.PositiveNumber;

import java.util.Arrays;

public enum ArithmeticOperator {
  ADDITION("+") {
    @Override
    public int arithmeticCalculate(PositiveNumber operand1, PositiveNumber operand2) {
      return operand1.toInteger() + operand2.toInteger();
    }
  },

  SUBTRACTION("-") {
    @Override
    public int arithmeticCalculate(PositiveNumber operand1, PositiveNumber operand2) {
      return operand1.toInteger() - operand2.toInteger();
    }
  },

  MULTIPLICATION("*") {
    @Override
    public int arithmeticCalculate(PositiveNumber operand1, PositiveNumber operand2) {
      return operand1.toInteger() * operand2.toInteger();
    }
  },

  DIVISION("/") {
    @Override
    public int arithmeticCalculate(PositiveNumber operand1, PositiveNumber operand2) {
      return operand1.toInteger() / operand2.toInteger();
    }
  };

  private final String operator;

  ArithmeticOperator(String operator) {
    this.operator = operator;
  }

  public abstract int arithmeticCalculate(PositiveNumber operand1, PositiveNumber operand2);

  public static int calculate(PositiveNumber operand1, String operator, PositiveNumber operand2) {
    ArithmeticOperator arithmeticOperator = Arrays.stream(values())
      .filter(v -> v.operator.equals(operator))
      .findFirst()
      .orElseThrow(() -> new IllegalArgumentException("올바른 사칙연산이 아닙니다"));

    return arithmeticOperator.arithmeticCalculate(operand1, operand2);
  }

}
