// `final` keyword usage
// - variables -- no reassignment of values
// - class -- no extends
// - methods -- no override

// final class FinalCalculator{
class FinalCalculator {
    // final public void show() {
    public void show(){
        System.out.println("By Himangshu");
    }

    public void add(int n1, int n2) {
        System.out.println(n1 + n2);
    }
}

class AdvFinalCalculator extends FinalCalculator {
    public void show() {
        System.out.println("By John");
    }
}

public class FinalKeyword {
    public static void main(String[] args) {
        final int num = 9;
        // num = 10; // compiler error: can't assign a value to final variable!

        final double PI = 3.14;
        // System.out.println(num);
        // System.out.println(PI);

        // ==============
        FinalCalculator obj = new FinalCalculator();
        obj.show();
        obj.add(4, 5);
        AdvFinalCalculator obj1 = new AdvFinalCalculator();
        obj1.show();

    }
}
