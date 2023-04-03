package com.company.practicalEx.nightshift;

public class NightTest {
    public static void main(String[] args) {
        Employee fred = new Employee("Fred", "Junior", 140000, 23);
        Employee george = new Employee("George", "Junior", 134000, 46);
        Employee barry = new Employee("Barry", "Junior", 120000, 21);
        Employee david = new Employee("David", "Junior", 110000, 20);

        Company google = new Company();

        google.addEmployees(fred, george, barry, david);
        System.out.println("Average Sal: " + google.getAverageSalary());
        System.out.println("Oldest Emp: " + google.getOldestEmployee().getFirstName());
        System.out.println("Night Shift tonight: " + google.getRandomEmployee().getFirstName());
    }
}
