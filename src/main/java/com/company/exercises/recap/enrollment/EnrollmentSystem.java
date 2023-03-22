package com.company.exercises.recap.enrollment;

import java.util.ArrayList;
import java.util.List;

public class EnrollmentSystem {

    private List<Student> students; // all students
    private List<Course> courses; // all courses

    public EnrollmentSystem() {
        this.students = new ArrayList<>();
        this.courses = new ArrayList<>();
    }

    public void addStudent(Student student) { // add student to all students
        if (this.students.contains(student)) {
            throw new IllegalArgumentException("Student with ID: " + student.getId() + " already exists");
        }
        this.students.add(student);
    }

    public void removeStudent(Student student) {
//        if (!this.students.contains(student)) {
//            throw new IllegalArgumentException("The student is not enrolled in this course.");
//        }
        this.students.remove(student);
    }

    public void addCourse(Course course) {
        if (this.courses.contains(course)) {
            throw new IllegalArgumentException("Course with course code: " + course.getCourseCode() + " already exists");
        }

        this.courses.add(course);
    }

    public void removeCourse(Course course) {
        this.courses.remove(course);
    }

    public void enrollStudentInCourse(Student student, Course course) {
        if (!this.students.contains(student)) {
            throw new IllegalArgumentException("Student with ID: " + student.getId() + " does not exist");
        }
        if (!this.courses.contains(course)) {
            throw new IllegalArgumentException("Course with course code: " + course.getCourseCode() + " does not exist");
        }

        course.enrollStudent(student);
        student.enrollCourse(course);
    }

    public List<Course> getCoursesForStudent(Student student) {
        return student.getEnrolledCourses();
    }

    public List<Student> getStudentsForCourse(Course course) {
        return course.getEnrolledStudents();
    }
}
