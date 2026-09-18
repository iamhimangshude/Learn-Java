public class Loops {
    public static void main(String[] args) {
        // doing a repeated tasks using loops in java

        // 1. For Loop

        // traditional way
        // for (int i = 0; i < 10; i++) {
        // System.out.printf(i + " ");
        // }

        // a bit modern way
        // int i = 0; // pre-setting the value
        // for (; i < 10;) {
        // System.out.printf(i + " ");
        // i++; // incrementing the value within the block!
        // }

        // 2. while
        // int j = 0;

        // while (j < 5) {
        // if (j == 3) {
        // j++;
        // continue;
        // }

        // if (j * 2 == 8)
        // break;

        // System.out.printf(j + " ");
        // j++;
        // }
        // System.out.println();

        // 3. do - while loop
        // var k = 10;
        // do {
        // System.out.println("hello");
        // k++;
        // } while (k < 10);

        // which to use when??
        // Solution: for: if we know the finiteness and limit, we use `for` loop
        // while: if we know finiteness but only condition to be used (like in case of
        // end of file operations)
        // we use `while` loop there!
        // do-while: we use `do-while` loop only when we know the condition and we
        // want to run a loop atleast once
    }
}
