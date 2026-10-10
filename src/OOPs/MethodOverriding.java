package OOPs;

class Class1 {

    public void show() {
        System.out.println("in Class1 show");
    }

    public void config() {
        System.out.println("in Class1 config");
    }
}

class Class2 extends Class1 {

    public void show() {
        System.out.println("in Class2 show");
    }
}

public class MethodOverriding {
    public static void main(String[] args) {
        Class1 obj = new Class1();
        obj.show();

        Class2 obj2 = new Class2();
        obj2.show();
    }
}
