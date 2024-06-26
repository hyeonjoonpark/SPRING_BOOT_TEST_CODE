package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * 요구사항
 * 평균학점 계산방법 = (학점수 * 교과목 평점)의 합계 / 수강신청 총 학점의 수
 * 일급 컬렉션 사용
 */

public class GradeCaculatorTest {
  // 학점계산기 도메인 : 이수한 과목(객체지향 프로그래밍, 자료구조, 영어회화), 학점계산기
  // 이수한 과목 : 객체지향 프로그래밍, 자료구조, 영어회화 ---> 과목 클래스

  // 이수한 과목을 전달하여 평균학점 계산요청 ---> 학점계산기 ---> (학점 수  * 교과목 평점)의 합계    ---> 과목
  //                                                  수강신청 총 학점의 수            ---> 과목


  @Test
  @DisplayName("평균학점을 계산한다")
  void calculateGradeTest() {
    List<Course> courses = List.of(
      new Course("OOP", 3, "A+"),
      new Course("자료구조", 3, "A+")
    );

    GradeCaculator gradeCaculator = new GradeCaculator(courses);
    double gradeResult = gradeCaculator.calculateGrade();

    assertThat(gradeResult).isEqualTo(4.5);
  }
}
