package oop;

public class BankChallenge {
    public static void main(String[] args) {
        // Bank himangshuAccount = new Bank("12345", 1000.0, "Himangshu De", "iamhimangshude@github.com", "9087654321");
        Bank himangshuAccount = new Bank();

        System.out.println(himangshuAccount.getAccountNumber());
        System.out.println(himangshuAccount.getBalance());
        // himangshuAccount.setAccountNumber("12345");
        // himangshuAccount.setBalance(1000.0);
        // himangshuAccount.setCustomerName("Himangshu De");
        // himangshuAccount.setEmail("iamhimangshude@github.com");
        // himangshuAccount.setPhoneNumber("9087654321");

        // himangshuAccount.withdraw(1001);
        // himangshuAccount.deposit(1000);
        // himangshuAccount.withdraw(500);
        // himangshuAccount.withdraw(400);
        // himangshuAccount.withdraw(100);

        // himangshuAccount.accountDetails();


        Bank timsAccount = new Bank("Tim", "tim@email.com", "8076954321");
        System.out.println("Account No: " + timsAccount.getAccountNumber() + "; Name: " + timsAccount.getCustomerName());
    }
}
