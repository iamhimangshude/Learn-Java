public class TypeConversion {
    public static void main(String[] args) {
        byte b;
        int a = 512;

        b = (byte) a; // explicit type casting
        // a = b; // implicit type casting (or conversion)

        System.out.println(a + " " + b);

        int num1 = (int) 5.6;

        System.out.println(num1);
    }
}
