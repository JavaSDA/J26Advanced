package com.company.exercises.recap.enrollment;

import java.util.ArrayList;
import java.util.List;

public class Course {
    private String name;
    private String courseCode;
    private String instructorName;
    private List<Student> enrolledStudents;

    public Course(String name, String courseCode, String instructorName) {
        this.name = name;
        this.courseCode = courseCode;
        this.instructorName = instructorName;
        this.enrolledStudents = new ArrayList<>();
    }

    public void enrollStudent(Student student) {
        enrolledStudents.add(student);
//        student.enrollCourse(this);
    }

    public void removeStudent(Student student) {
        enrolledStudents.remove(student);
//        student.dropCourse(this);
    }

    public String getName() {
        return name;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public String getInstructorName() {
        return instructorName;
    }

    public List<Student> getEnrolledStudents() {
        return enrolledStudents;
    }

}
