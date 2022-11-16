package org.example;


import java.util.List;

public class GradeCalculator {

    private final Courses courses;

    public GradeCalculator(List<Course> courses) {
        this.courses = new Courses(courses);
    }

    public GradeCalculator(Courses courses) {
        this.courses = courses;
    }

    public double calculateGrade() {
        double multipleCreditAndCoursesGrade = courses.multipleCreditAndCourseGrade();

        int totalCompletedCredit = courses.calculateTotalCompletedCredit();

        return multipleCreditAndCoursesGrade / totalCompletedCredit;
    }
}
