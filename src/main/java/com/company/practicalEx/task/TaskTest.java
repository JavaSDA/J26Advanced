package com.company.practicalEx.task;

public class TaskTest {
    public static void main(String[] args) {
        try {
            TaskList tl = new TaskList();
            tl.addTask();
            tl.addTask();
            tl.printTasks();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
