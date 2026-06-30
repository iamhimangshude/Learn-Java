package Foundation;

import java.util.Scanner;

public class DataStream {
    static void main() {
        Scanner inputScn = new Scanner(System.in);
        int sum = 0;
        while (true){
            System.out.println("Enter a number: ");
            int userInput = Integer.parseInt(inputScn.nextLine());
            if (userInput<0){
                System.out.println("Warning: Invalid number provided! Skipping...");
                continue;
            }
            if (userInput== 999){
                System.out.println("Exiting loop");
                break;
            }
            sum += userInput;
        }
        System.out.println("The sum of all positive integers is: " + sum);
    }
}
