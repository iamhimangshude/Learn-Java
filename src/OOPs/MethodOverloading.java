package OOPs;

class Calculator {

    public int add(int n1, int n2, int n3) {
        return n1 + n2 + n3;
    }

    public int add(int n1, int n2) {
        return n1 + n2;
    }

    public double add(double n1, int n2) {
        return n1 + n2;
    }

}

public class MethodOverloading {
    public static void main(String[] args) {
        // code here...
        Calculator obj = new Calculator();
        int result = obj.add(4, 6, 7);
        System.out.println(result);
    }
}
