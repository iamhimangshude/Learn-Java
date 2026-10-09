package OOPs;

class A {

    public A() {
        System.out.println("object created");
    }

    public void show() {
        System.out.println("in A show");
    }
}

public class AnonymousObj {
    public static void main(String[] args) {
        
        // Anonymous Obj: because they don't have a variable name
        new A().show(); // they directly act as reference
        new A().show();
        
    }
}
