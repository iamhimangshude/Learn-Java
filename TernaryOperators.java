public class TernaryOperators {
    public static void main(String args[]) {
        int n = 4;
        int result = 0;

        // usual way
        // if (n % 2 == 0) {
        // result = 10;
        // } else {
        // result = 20;
        // }

        // Mentos Way: Ternary Operator
        result = n % 2 == 0 ? 10 : 20;

        System.out.println(result);
    }
}
