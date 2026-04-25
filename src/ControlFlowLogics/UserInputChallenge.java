package ControlFlowLogics;

import java.util.Scanner;

public class UserInputChallenge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int i = 0, sum = 0;
        do {
            // this
            try {
                System.out.println("Enter number #" + (i + 1) + ":");
                double userNum = Double.parseDouble(scanner.nextLine());
                sum += userNum;
                i++;
            } catch (NumberFormatException e) {
                System.out.println("Invalid number");
                continue;
            }
        } while (i < 5);
        scanner.close();

        System.out.println("The sum of those 5 numbers are: " + sum);

    }
}
