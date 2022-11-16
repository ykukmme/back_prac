package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class GradeCalculatorTest {
    //학점계산기 도메인: 과목, 학점 계산
    // A과목, B과목, C과목 --> 과목 클래스

    //과목의 성적을 계산요청 --> 학점 계산기 --> (학점수 + 평점)의 합계, 총학점 수 --> 과목

    @DisplayName("평균 학점을 계산함")
    @Test
    void calculateGradeTest() {
        List<Course> courses = List.of(new Course("A", 3, "A+"), new Course("B", 3, "A+"));

        GradeCalculator gradeCalculator = new GradeCalculator(new Courses(courses));
        double gradeResult = gradeCalculator.calculateGrade();

        assertThat(gradeResult).isEqualTo(4.5);
    }
}
