package OOPs;

class AnonInnerClassA {
    public void show() {
        System.out.println("in A show");
    }
}

public class AnonInnerClass {
    public static void main(String[] args) {
        AnonInnerClassA obj = new AnonInnerClassA() {
            public void show() {
                System.out.println("in new Show");
            }
        };
        obj.show();
    }
}
