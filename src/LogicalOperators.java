public class LogicalOperators {
    public static void main(String[] args) {
        int x = 10;
        int y = 11;

        int a = 5;
        int b = 15;

        boolean result = x <= y & a > b;
        System.out.println(result);

        result = x <= y | a > b;
        System.out.println(result);

        result = x <= y && a > b;
        System.out.println(result);

        result = x <= y && a > b;
        System.out.println(!result);

        result = x <= y || a > b;
        System.out.println(result);

    }
}
