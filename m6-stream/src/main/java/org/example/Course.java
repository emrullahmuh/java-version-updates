package org.example;

public class Course {
    private String coursename;
    private int courseId;

    public Course(String coursename, int courseId) {
        this.coursename = coursename;
        this.courseId = courseId;
    }

    public String getCoursename() {
        return coursename;
    }

    public int getCourseId() {
        return courseId;
    }
}
