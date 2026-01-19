public class Conditionals2 {
    public static void main(String[] args) {
        int x = 8;
        int y = 9;
        int z = 4;

        if (x > y && x > z) {
            System.out.println(x);
        } else if (y > z) {
            System.err.println(y);
        } else {
            System.out.println(z);
        }
    }
}
