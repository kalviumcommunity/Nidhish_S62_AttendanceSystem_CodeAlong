package com.school;

public class Course {
    private static int courseIdCounter = 101;
    int courseId; // e.g., "CS101"
    String courseName;

    public Course(String cName) {
        this.courseId = courseIdCounter++;
        this.courseName = cName;
    }

    public void setDetails(int id, String cName) {
        this.courseId = id;
        this.courseName = cName;
    }

    public void displayDetails() {
        System.out.println("Course ID: " + this.courseId + ", Name: " + this.courseName);
    }
}