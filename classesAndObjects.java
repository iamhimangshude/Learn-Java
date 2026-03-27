class Calculator {
    public int add(int num1, int num2) {
        return num1 + num2;
    }

    public int sub(int num1, int num2) {
        return num1 - num2;
    }
}

public class classesAndObjects {
    public static void main(String[] args) {

        Calculator calcObj = new Calculator();

        int sum = calcObj.add(1, 2);
        System.out.println("Sum: " + sum);

        int diff = calcObj.sub(3, 2);
        System.out.println("Difference: " + diff);
    }
}