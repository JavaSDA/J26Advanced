package com.company.exercises.recap.enrollment;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private int id;
    private String name;
    private Major major;
    private List<Course> enrolledCourses;
    
    public Student(String name, int id, Major major) {
        this.name = name;
        this.id = id;
        this.major = major;
        this.enrolledCourses = new ArrayList<>();
    }

    public void enrollCourse(Course course) {
        if (enrolledCourses.contains(course)) {
            throw new IllegalArgumentException("The student is already enrolled in this course.");
        }
        enrolledCourses.add(course);
//        course.enrollStudent();// TODO: complete this.
    }

    public void dropCourse(Course course) {
        if (!enrolledCourses.contains(course)) {
            throw new IllegalArgumentException("The student is not enrolled in this course.");
        }
        enrolledCourses.remove(course);
//        course.dropStudent();
    }


    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Major getMajor() {
        return major;
    }

    public List<Course> getEnrolledCourses() {
        return enrolledCourses;
    }

    @Override
    public String toString() {
        return "Student {" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", major=" + major +
                ", enrolledCourses=" + enrolledCourses +
                '}';
    }
}
