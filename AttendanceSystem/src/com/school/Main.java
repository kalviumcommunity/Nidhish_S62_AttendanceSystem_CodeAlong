package com.school;

public class Main {
    public static void main(String[]args) {
        System.out.println("--- School Attendance System ---");

        Student[] students = new Student[3];
        students[0] = new Student("Alice Wonderland");
        students[1] = new Student("Bob The Builder");
        students[2] = new Student("Charlie Brown");

        Course[] courses = new Course[3];
        courses[0] = new Course("Intro to Programming");
        courses[1] = new Course("Linear Algebra");
        courses[2] = new Course("Data Structures");

        System.out.println("\nRegistered Students:");
        for (Student student : students) {
            if (student != null) student.displayDetails();
        }

        System.out.println("\nAvailable Courses:");
        for (Course course : courses) {
            if (course != null) course.displayDetails();
        }
        System.out.println("\nSession 2: Core Domain Modelling Complete.");

        System.out.println("\nSession 3: Initialized Constructore and Auto-ID generation Complete.");

        
        AttendanceRecord[] attendanceRecords = new AttendanceRecord[3];

        // Sample data for attendance records
        attendanceRecords[0] = new AttendanceRecord(students[0].getStudentId(), courses[0].getCourseId(), "Present");
        attendanceRecords[1] = new AttendanceRecord(students[1].getStudentId(), courses[1].getCourseId(), "Absent");
        attendanceRecords[2] = new AttendanceRecord(students[2].getStudentId(), courses[2].getCourseId(), "Late");

        // Display attendance records
        System.out.println("\n--- Attendance Records ---");
        for (AttendanceRecord record : attendanceRecords) {
            if (record != null) record.displayRecord();
        }

        System.out.println("\nSession 4: Data Encapsulation and Attendance Records Displayed Complete.");
    }
}