public class MathClass {
    public static void main(String[] args){
        Calculator calc = new Calculator();
        int result = calc.add(1, 3);
        System.out.println(result);
    }
}

class Calculator{
    public int add (int num1, int num2){
        return num1 + num2;
    }
}
