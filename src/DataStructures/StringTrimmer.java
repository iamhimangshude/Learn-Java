package DataStructures;

import java.util.Scanner;

public class StringTrimmer {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("enter an email: ");
        String userEmailInput = scanner.nextLine();

        String userEmailTrimmed = userEmailInput.trim();
        int indexOfSpecialChar = userEmailTrimmed.indexOf("@");
        String companyDomain = userEmailTrimmed.substring(indexOfSpecialChar + 1);

        String companyDomainInSmall = companyDomain.toLowerCase();
        int indexOfFullStop = companyDomainInSmall.indexOf(".");
        String companyName = companyDomainInSmall.substring(0, indexOfFullStop);
        System.out.println("Username is: " + userEmailTrimmed.substring(0, indexOfSpecialChar));
        System.out.println("Company name is: " + companyName);
    }
}
