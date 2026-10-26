package Interfaces;

@FunctionalInterface
interface DemoA {
    void show(int i);
}

// class DemoB implements DemoA{
// public void show(){
// System.out.println("in Show");
// }
// }

public class LambdaExp {
    public static void main(String[] args) {
        // DemoB obj = new DemoB();
        // DemoA obj = new DemoA() {
        // public void show(int i){
        // System.out.println("in Show " + 5);
        // }
        // };

        // equivalent lambda exp

        // DemoA obj = (i) -> {
        // System.out.println("in Show " + i);
        // };

        // or more simply
        DemoA obj = i -> System.out.println("in Show " + i);

        obj.show(5);

    }
}
