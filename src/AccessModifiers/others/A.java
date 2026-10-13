package AccessModifiers.others;

class Launch {
    public void abc(){
        A objA = new A();
        System.out.println(objA.marks);
    }
}

public class A {
    protected int marks = 6;

    public void show() {
        System.out.println("in A show");
    }
}
