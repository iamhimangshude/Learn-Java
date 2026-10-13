package LeetCode;

public class Problem67 {
    public static void main(String[] args) {
        System.out.println(new Solution().addBinary("11", "1"));
        System.out.println(new Solution().addBinary("1010", "1011"));
        System.out.println(new Solution().addBinary("0", "0"));
        System.out.println(new Solution().addBinary("1", "111"));
        System.out.println(new Solution().addBinary("100", "110010"));

    }
}

class Solution {
    public String addBinary(String a, String b) {
        if (a.equals("0") && b.equals("0"))
            return "0";

        if (a.equals("0"))
            return b;
        if (b.equals("0"))
            return a;

        int carry = 0, sum = 0;
        int i = a.length() - 1;
        int j = b.length() - 1;
        String c = "";

        while (i >= 0 || j >= 0) {
            int aNum = (i < 0) ? 0 : Integer.valueOf(String.valueOf(a.charAt(i)));
            int bNum = (j < 0) ? 0 : Integer.valueOf(String.valueOf(b.charAt(j)));

            sum = carry + aNum + bNum;
            carry = sum / 2;
            sum = sum % 2;
            c = sum + c;
            i--;
            j--;
        }

        // c = carry + c;

        return carry == 1 ? carry + c : c;
    }
}

// Solution optimized by Gemini
// class Solution {
// public String addBinary(String a, String b) {
// StringBuilder sb = new StringBuilder();
// int i = a.length() - 1;
// int j = b.length() - 1;
// int carry = 0;

// // Loop while there are digits left or a leftover carry
// while (i >= 0 || j >= 0 || carry > 0) {
// int sum = carry;

// if (i >= 0) {
// sum += a.charAt(i) - '0'; // Fast char-to-int conversion
// i--;
// }
// if (j >= 0) {
// sum += b.charAt(j) - '0';
// j--;
// }

// carry = sum / 2;
// sb.append(sum % 2); // Appending to StringBuilder is O(1) amortized
// }

// // Since we built the string backwards, reverse it at the end
// return sb.reverse().toString();
// }
// }