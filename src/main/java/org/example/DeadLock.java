package org.example;

public class DeadLock {
    public static void main(String[] args) {

        final String resource1 = "ratan jaiswal";
        final String resource2 = "vimal jaiswal";
        // t1 tries to lock resource1 then resource2

        Runnable runnable1 = () -> {
            synchronized (resource1) {
                System.out.println("Thread 1: locked resource 1");

                try {
                    Thread.sleep(100);
                } catch (Exception e) {
                }

                synchronized (resource2) {
                    System.out.println("Thread 1: locked resource 2");
                }
            }
        };

        // t2 tries to lock resource2 then resource1
        Runnable runnable2 = () -> {

            synchronized (resource2) {
                System.out.println("Thread 2: locked resource 2");

                try { Thread.sleep(100);} catch (Exception e) {}

                synchronized (resource1) {
                    System.out.println("Thread 2: locked resource 1");
                }
            }
        };

        Thread t1 = new Thread(runnable1);
        t1.start();

        Thread t2 = new Thread(runnable2);
        t2.start();
    }
}
