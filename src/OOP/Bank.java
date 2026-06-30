package OOP;

public class Bank {
    static void main(String[] args) {
        BankAccount hdfc = new BankAccount("John Doe", "7961325134131");
        hdfc.deposit(-100);
        hdfc.deposit(1000);
        hdfc.deposit(256.98);
        hdfc.deposit(54.39);
        hdfc.withdraw(10000);
        hdfc.withdraw(230.46);
        hdfc.withdraw(2000);
        hdfc.withdraw(150);
        System.out.println();
        hdfc.displayAccountInfo();
    }
}

class BankAccount{
    private String accountHolder;
    private String accountNumber;
    private double balance;

    public BankAccount(String accountHolder, String accountNumber){
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = 0.0;
    }

    public void deposit(double amount){
        if (amount < 0 || amount == 0.0){
            System.out.println("Amount cannot be negative or zero");
            return;
        }
        this.balance += amount;
        System.out.println("successfully deposited");
    }
    public void withdraw(double amount){
        if (amount > balance){
            System.out.println("Insufficient balance");
            return;
        }
        if (amount == 0){
            System.out.println("Amount cannot be zero");
            return;
        }
        this.balance -= amount;
        System.out.println("Successfully withdrawn");
    }
    public void displayAccountInfo(){
        System.out.printf("Account Details-------%nAccount Holder: %s%nAccount Number: %s%nAvailable Balance: %.2f%n", accountHolder, accountNumber, balance);
    }
}