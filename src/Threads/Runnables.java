package Threads;

public class Runnables {
    public static void main(String[] args) {
        Runnable obj1 = () -> {
            for (int i = 1; i< 101;i++){
                System.out.println("Hi " + i);
            }
        };
        
        Runnable obj2 = () -> {
            for (int i = 1; i< 101;i++){
                System.out.println("Hello " + i);
            }
        };

        // obj1.run();
        // obj2.run();

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start();
        t2.start();
    }
}
