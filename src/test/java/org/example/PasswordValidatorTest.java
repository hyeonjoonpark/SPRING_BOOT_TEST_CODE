package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThatCode;

/**
 * 비밀번호는 최소 8자이상 12자이하여야 한다.
 * 비밀번호가 8자미만 12자이상인 경우 IllegalArgumentException 예외를 발생시켜야 한다.
 * 경계조건에 대해 테스트 코드를 작성하여야 한다
 */

public class PasswordValidatorTest {
  @Test
  @DisplayName("비밀번호는 최소 8자이상 12자이하이면 예외가 발생하지 않는다")
  void validatePasswordSuccessTest() {
    assertThatCode(() -> PasswordValidator.validate("thispassword"))
      .doesNotThrowAnyException(); // assertThatCode 안에 코드가 실행되었을 때 아무 에러 에러가 발생하지 않는다
  }

  @Test
  @DisplayName("비밀번호 8자미만 12자이상이면 IllegalArgumentException 예외 발생")
  void validatePasswordFailedTest() {
    assertThatCode(() -> PasswordValidator.validate("abc"))
      .isInstanceOf(IllegalArgumentException.class)
      .hasMessage("비밀번호는 최소 8자이상 12자이하여야 합니다.");
  }
}
