package org.ibm.oops;

public class TestThread {
    public static void main(String[] args) {
        Runnable taskA = () -> {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Inside Task A");
        };

        Runnable taskB = () -> {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Inside Task B");
        };

        // System.out.println("main task");

        Thread a1 = new Thread(taskA);
        Thread a2 = new Thread(taskB);

        a1.start();
        a2.start();

        System.out.println("main task");




    }
}
