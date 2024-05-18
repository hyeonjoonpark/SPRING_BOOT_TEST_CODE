package org.example;

import java.util.List;

public class GradeCaculator {
  private final Courses courses;

  public GradeCaculator(List<Course> courses) {
    this.courses = new Courses(courses);
  }

  public double calculateGrade() {
    // (학점 수 * 교과목 평점)의 합계
    double totalCompletedCreditAndCourseGrade = courses.multiplyCreditAndCourseGrade();

    // 수강신청 총 학점 수
    int totalCompletedCredit = courses.calculateTotalCompletedCredit();

    return totalCompletedCreditAndCourseGrade / totalCompletedCredit;
  }
}
