public class WhileLoop {
    public static void main(String a[]) {

        // We use loops to do something repeatedly as long as the condition or the logic
        // is valid.
        // While loop - A condition driven loop
        int i = 1;

        // Normal Loop
        // while (i <= 4) {
        // System.out.println("Hi " + i);
        // i++;
        // }

        // Nested loop
        while (i <= 4) {
            System.out.println("Hi " + i);
            int j = 1;
            while (j <= 3) {
                System.out.println("Hello " + j);
                j++;
            }
            i++;
        }
        System.out.println("Bye" + i);
    }
}
