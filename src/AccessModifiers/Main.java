package AccessModifiers;

import AccessModifiers.others.*;

class C extends A{
    public void abc(){
        A objA = new A();
        // System.out.println(objA.marks);
    }
}

public class Main {
    public static void main(String[] args) {
        A objA = new A();
        // System.out.println(objA.marks);
        // objA.show();

        B objB = new B();
        System.out.println(objB.marks);
    }
}

// Read notes for details!