package org.example;

public class PasswordValidator {
  public static final String WRONG_PASSWORD_LENGHT_EXCEPTION_MESSAGE = "비밀번호는 최소 8자이상 12자이하여야 합니다.";

  public static void validate(String password) {
    int length = password.length();
    if (length < 8 || length > 12) {
      throw new IllegalArgumentException(WRONG_PASSWORD_LENGHT_EXCEPTION_MESSAGE);
    }
  }
}

