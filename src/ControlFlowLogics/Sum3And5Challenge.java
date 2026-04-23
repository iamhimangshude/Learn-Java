package ControlFlowLogics;

public class Sum3And5Challenge {
    public static void main(String[] args) {
        int sum = 0, count = 0;
        for (int i = 1; count < 5 && i <= 1000; i++) {
            if ((i % 3 == 0) && (i % 5 == 0)) {
                sum += i;
                System.out.println(i + " is divisible both by 3 and 5");
                count++;
            }
        }
        System.out.println("The sum of numbers divisible by both 3 and 5 is " + sum);
    }
}
