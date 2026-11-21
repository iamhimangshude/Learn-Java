package LeetCode;

public class Problem70 {
    static void main() {
        var result = climbStairs(4);

        System.out.println("ways: " + result);
    }

    public static int climbStairs(int n) {
        if (n == 1 || n == 2 || n == 3)
            return n;
        int a = 1;
        int b = 2;
        int c = 1;
        for (int i = 0; i < n; i++) {
            c = a + b;
            if (c >= n) return c;
            a = b;
            b = c;
        }

        return c;
    }
}