package oop;

// Note: Invocation of this class is done in ClassesChallenge.java file.
public class Bank {
    private int accountNumber;
    private double balance = 0.0D;
    private String customerName;
    private String email;
    private String phoneNumber;

    public void accountDetails() {
        System.out.println("Customer: " + this.customerName +
                "\nPhone No.: " + this.phoneNumber +
                "\nEmail: " + this.email +
                "\nBalance: " + this.balance +
                "\nAccount Number: " + this.accountNumber);
    }

    public void deposit(double amount) {
        this.balance += amount;
        System.out.println("Amount " + amount + " deposited succesfully!");
        System.out.println("Available balance: " + balance);
    }

    public void withdraw(double amount) {
        if (amount > this.balance) {
            System.out.println("Insufficient balance. Available balance: " + this.balance);
        } else {
            this.balance -= amount;
            System.out.println("Withdrawal success. Available balance: " + this.balance);
        }
    }

    public int getAccountNumber() {
        return this.accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return this.balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return this.customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

}
