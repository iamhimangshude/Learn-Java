package OOPs;

class InnerClassA {
    int age;

    public void show() {
        System.out.println("in A show");
    }

    static class B {
        public void config() {
            System.out.println("in config");
        }
    }
}

public class InnerClass {
    public static void main(String[] args) {
        InnerClassA obj = new InnerClassA();
        obj.show();

        InnerClassA.B obj1 = new InnerClassA.B();
        obj1.config();

    }
}
