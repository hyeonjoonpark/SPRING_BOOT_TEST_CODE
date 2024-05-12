package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * 요구사항
 * 간단한 사칙연산을 할 수 있다.
 * 양수로만 계산할 수 있다
 * 나눗셈에서 0을 나누는 경우 IllegalArgumentException을 발생시킨다
 * MVC패턴 기반으로 구현한다
 */
public class CaculatorTest {
  @Test
  @DisplayName("덧셈연산을 수행한다")
  void addTest() {
    int result = Calculator.calculate(1, "+", 2);

    assertThat(result).isEqualTo(3);
  }

  @Test
  @DisplayName("뺼셈연산을 수행한다")
  void subTest() {
    int result = Calculator.calculate(1, "-", 2);

    assertThat(result).isEqualTo(-1);
  }
}
