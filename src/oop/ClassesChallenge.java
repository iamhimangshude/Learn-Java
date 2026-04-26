package oop;

public class ClassesChallenge {
    public static void main(String[] args) {
        Bank account = new Bank();

        account.setAccountNumber(12345);
        account.setBalance(1000.0);
        account.setCustomerName("Himangshu De");
        account.setEmail("iamhimangshude@github.com");
        account.setPhoneNumber("9087654321");
        
        account.withdraw(1001);
        account.deposit(1000);
        account.withdraw(500);
        account.withdraw(400);
        account.withdraw(100);

        account.accountDetails();
    }
}
