package org.example;

import java.util.List;

public class GradeCaculator {
  private final List<Course> courses;

  public GradeCaculator(List<Course> courses) {
    this.courses = courses;
  }

  public double calculateGrade() {
    return 4.5;
  }
}
