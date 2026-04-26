package ControlFlowLogics;

import java.util.Scanner;

public class MinMaxChallenge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double min = 0, max = 0;
        int loopCount = 0;

        while (true){
            try{
                System.out.println("Enter a number, or any character to exit: ");
                Double userNum = Double.parseDouble(scanner.nextLine());

                if (userNum < min) min = userNum;
                if (userNum > max) max = userNum;

                loopCount++;
                
            } catch (NumberFormatException invalidNum){
                break;
            }
        }

        if (min == 0 && max == 0){
            System.out.println(" No valid data entered ");
        }
        else {
            System.out.println("Total numbers entered: " + loopCount);
        System.out.println("Minimum number entered is " + min + " and maximum number entered is " + max);

        }

        scanner.close();
    }
}
