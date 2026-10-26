package Enums;

public class Main {
    public static void main(String[] args) {
        int i = 5;
        // Status s = Status.Running;
        Status[] s = Status.values();
        // System.out.println(s);
        // System.out.println(s.ordinal());

        // for (Status stat : s) {
        //     System.out.println(stat + " : " + stat.ordinal());
        // }

        // Laptop lap = Laptop.MacBook;
        // System.out.println(lap + " : " + lap.getPrice());
        
        for (Laptop lap: Laptop.values()){
            System.out.println(lap + " : " + lap.getPrice());
        }
    }
}
