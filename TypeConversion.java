class TypeConversion {
    public static void main(String ags[]) {
        // Type conversion and casting
        // byte b = 127;
        // int a = 257;
        // byte k = (byte) a;

        // float f = 5.6f;
        // int t = (int) f;

        // This is called casting (explicit); explicit because we've to tell the
        // compiler
        // b = a;// This is not permitted by the compiler. SO do ...
        // b = (byte) a; // ... this

        // This is implicit type conversion; implicit because we don't have to tell the
        // compiler
        // a = b;

        // System.out.println(t);

        // Type Promotion
        byte a = 10;
        byte b = 30;

        int result = a * b; // here happens the type promotion
        // bcs, as per logic byte value times byte value should result in a
        // byte value but the byte doesn't have the range to store the result (here it
        // 300)
        // so the type will be promoted to `int` than `byte`. This is mechanism is
        // called type promotion.
        System.out.println(result);
    }
}