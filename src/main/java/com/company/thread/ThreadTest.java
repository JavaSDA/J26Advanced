package com.company.thread;

public class ThreadTest {

    public static void main(String[] args) {
        // Thread is the execution thread(the operation being carried out)
        // in  a program.

        Thread thread1 = new Thread(() -> {
            System.out.println("Sleeping for 6 seconds.");
            try {
                Thread.sleep(6000);
                System.out.println("Done sleeping, 6 seconds");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        Thread thread2 = new Thread(() -> {
            System.out.println("Sleeping for 3 seconds");
            try{
                Thread.sleep(3000);
                System.out.println("Done sleeping, 3 seconds");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        thread1.start();
        thread2.start();
    }

}
