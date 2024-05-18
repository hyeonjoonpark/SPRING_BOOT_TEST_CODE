package org.example;

import java.util.List;

public class GradeCaculator {
  private final List<Course> courses;

  public GradeCaculator(List<Course> courses) {
    this.courses = courses;
  }

  public double calculateGrade() {
    double multipliedCreditAndCourseGrade = 0.0;

    // (학점 수 * 교과목 평점)의 합계
    for (Course course : courses) {
      multipliedCreditAndCourseGrade += course.multiplyCreditAndCourseGrade();
    }

    // 수강신청 총 학점 수
    int totalCompletedCredit = courses
      .stream().mapToInt(Course::getCredit).sum();

    return multipliedCreditAndCourseGrade / totalCompletedCredit;
  }
}
