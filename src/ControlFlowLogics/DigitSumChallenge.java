package ControlFlowLogics;

public class DigitSumChallenge {

    public static void main(String[] args) {
        int result = sumDigits(125);
        System.out.println("The sum of the digits is " + result);

        // NOTE: This problem is to be solved using loops and not using recursions.
        // But I did that out of my curiosity!
    }

    public static int sumDigits(int num) {
        if (num < 0) {
            return -1;
        }
        if ((num / 10) == 0) {
            return num;
        }
        return (num % 10) + sumDigits(num / 10);
    }
}
