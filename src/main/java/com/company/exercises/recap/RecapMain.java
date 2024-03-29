package com.company.exercises.recap;

import com.company.exercises.recap.enrollment.Course;
import com.company.exercises.recap.enrollment.EnrollmentSystem;
import com.company.exercises.recap.enrollment.Major;
import com.company.exercises.recap.enrollment.Student;
import com.company.exercises.recap.person.Company;
import com.company.exercises.recap.person.Employee;
import com.company.exercises.recap.person.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RecapMain {
    public static void main(String[] args) {
        /*Scanner scan = new Scanner(System.in);

       Person fred = new Person("Fred", "Benson", 23);
       Person george = new Person("George", "Benson", 33);

       Employee fredEmployee = new Employee(fred, "Fishing", 30000, 2);
       Employee georgeEmployee = new Employee(george, "Farmer", 34000, 1);

        System.out.print("How many employees?: ");
        int count = scan.nextInt();
        List<Employee> employees = new ArrayList<>();

        for (int i = 0; i < count; i++) {
            System.out.print("Enter firstName: ");
            String fName = scan.next();
            System.out.print("Enter lastName: ");
            String lName = scan.next();
            System.out.print("Enter age: ");
            int age = scan.nextInt();
            System.out.print("Enter occupation: ");
            String occ = scan.next();
            System.out.print("Enter salary: ");
            float sal = scan.nextFloat();
            System.out.print("Enter employeeId: ");
            int id = scan.nextInt();

            employees.add(new Employee(fName, lName, age, occ, sal, id));
        }

//        List<Employee> employees = new ArrayList<>();
//        employees.add(fredEmployee);
//        employees.add(georgeEmployee);
//        Company microsoft = new Company("Microsoft", employees);
//        System.out.println(microsoft.getAverageSalary());
//

        Company google = new Company("Google");
        google.addEmployee(fredEmployee, georgeEmployee, fredEmployee, georgeEmployee);
        System.out.println("Google's average salary: " + google.getAverageSalary());
        System.out.println(google);*/

        Course mat = new Course("Math", "Mat101", "Mr Charles");
        Course eng = new Course("English", "Eng101", "Mr John");

        Student fred = new Student("Fred", 1, Major.BUSINESS);
        Student dave = new Student("Dave", 2, Major.COMPUTER_SCIENCE);

        EnrollmentSystem universityOfEstonia = new EnrollmentSystem();

        universityOfEstonia.addStudent(fred); // add students
        universityOfEstonia.addCourse(mat); // add course
        universityOfEstonia.enrollStudentInCourse(fred, mat); // enroll student
        System.out.println(universityOfEstonia.getStudentsForCourse(mat)); // get students in a course
        System.out.println(universityOfEstonia.getCoursesForStudent(fred)); // get courses enrolled by a student
//        universityOfEstonia.removeStudent(fred);
//        universityOfEstonia.removeCourse(mat);
    }
}
