package ControlFlowLogics;

public class PrimeNumberChallenge {
    public static void main(String[] args) {
        // System.out.println("0 is " + (isPrime(0) ? "" : "NOT ") + "a prime number");
        // System.out.println("1 is " + (isPrime(1) ? "" : "NOT ") + "a prime number");
        // System.out.println("2 is " + (isPrime(2) ? "" : "NOT ") + "a prime number");
        // System.out.println("3 is " + (isPrime(3) ? "" : "NOT ") + "a prime number");
        // System.out.println("4 is " + (isPrime(4) ? "" : "NOT ") + "a prime number");

        // mini challenge
        int count = 0;

        for (int i = 0; count < 3 && i <= 1000; i++) {
            if (isPrime(i)) {
                count++;
                System.out.println(i + " is a prime number");
            }
        }
    }

    public static boolean isPrime(int wholeNumber) {
        if (wholeNumber <= 2)
            return (wholeNumber == 2);

        for (int divisor = 2; divisor <= wholeNumber / 2; divisor++) {
            if (wholeNumber % divisor == 0)
                return false;
        }
        return true;
    }
}
