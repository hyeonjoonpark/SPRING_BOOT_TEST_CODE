package org.example.calculate;

public class PositiveNumber {
  final int value;

  public PositiveNumber(int value) {
    validate(value);
    this.value = value;
  }

  private void validate(int value) {
    if(isNegativeNumber(value)) {
      throw new IllegalArgumentException("양수가 아닙니다");
    }
  }

  private boolean isNegativeNumber(int value) {
    return value < 0;
  }

  public int toInteger() {
    return value;
  }
}
