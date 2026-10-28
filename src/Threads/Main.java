package Threads;

class ThreadsA extends Thread {
    public void run() {
        for (int i = 1; i <= 100; i++) {
            System.out.println("hi " + i);

            // setting the sleep duration for the thread
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class ThreadsB extends Thread {
    public void run() {
        for (int i = 1; i <= 100; i++) {
            System.out.println("hello " + i);
            
            // setting the sleep duration for the thread
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {
        ThreadsA obj1 = new ThreadsA();
        ThreadsB obj2 = new ThreadsB();

        // setting and getting thread priority!
        System.out.println(obj1.getPriority());
        System.out.println(obj2.getPriority());
        obj1.setPriority(6);
        obj2.setPriority(3);
        System.out.println(obj1.getPriority());
        System.out.println(obj2.getPriority());
        //------------------
        obj1.start();
        try {
            Thread.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        obj2.start();

    }
}
