public class ForLoop {
    public static void main(String a[]) {
        // int i = 1;
        // Nomral for loop
        // for (int i = 0; i < 4; i++) {
        // System.out.println("Hello " + i);
        // }

        // Nested for loop
        for (int i = 1; i < 6; i++) {
            System.out.println("DAY " + i);
            for (int j = 1; j <= 9; j++) {
                System.out.println("    " + (j + 8) + " - " + (j + 9));
            }
        }
    }
}
