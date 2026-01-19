public class Literals {
    public static void main(String[] a) {
        // literals
        int num1 = 0b1111; // this is in binary
        int num2 = 0x7E; // this is in hex
        int num3 = 10_00_00_000; // for ease in counting no of zeroes

        double num4 = 56;
        double num5 = 12e10; // in epsilon format

        // boolean isCorrect = 1; // doesn't work
        boolean isCorrect = true; // this works

        // characters
        char c = 'a';

        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);
        System.out.println(num4);
        System.out.println(num5);
        System.out.println(isCorrect);
        System.out.println(c);

        // character increment operation
        c++;
        System.out.println(c);
    }
}
