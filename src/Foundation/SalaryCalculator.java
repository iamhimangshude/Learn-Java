package Foundation;

import java.util.Scanner;

public class SalaryCalculator {
    static void main() {
        Scanner inputScn = new Scanner(System.in);
        System.out.println("Enter the monthly salary of the employee: ");
        double baseSalary = Double.parseDouble(inputScn.nextLine());
        int tax = 0;

        if (baseSalary <= 30000) {
            tax = 5;
        } else if (baseSalary >= 30001 && baseSalary <= 80000) {
            tax = 15;
        } else if (baseSalary > 80000) {
            tax = 25;
        }
        double finalSalary = baseSalary - (((double)tax/100) * baseSalary);
        System.out.println("In hand salary after tax is: " + finalSalary);
    }
}
