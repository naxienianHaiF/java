package com.wjh.java.foundation.reflect;

/**
 * @author wjh
 * @date 2020/5/17 9:39
 */
public class Student extends Person{

    @Deprecated
    private String grade;
    public String teacher;
    int score;

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "grade='" + grade + '\'' +
                ", teacher='" + teacher + '\'' +
                ", score=" + score +
                '}';
    }
}
