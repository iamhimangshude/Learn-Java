package OOPs;

class B extends Object {
    public B() {
        super(); // this calls Object class' constructor!
        System.out.println("in B");
    }

    public B(int n) {
        System.out.println("in B int");
    }
}

class C extends B {
    public C() {
        super(); // it is there like john cena! in every constructor!
        System.out.println("in C");
    }

    public C(int n) {
        // super(n); // this calls the parameterized constructor of B
        this(); // this calls default constructor of C and default constructor of C calls
                // default constructor of B!
        System.out.println("in C int");
    }
}

public class ThisAndSuper {
    public static void main(String[] args) {
        C obj = new C();

    }
}
