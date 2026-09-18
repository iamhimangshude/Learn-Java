public class Literals {
    public static void main(String[] args) {
        // literals

        int num = 0b101;

        int hexNum = 0x7E;

        System.out.println(num);
        System.out.println(hexNum);

        int num2 = 10_00_000; // readable version of 1000000
        System.out.println(num2);

        double num3 = 12e7;
        System.out.println(num3);

        char c = 'a';
        c++;
        System.out.println(c);
    }
}
