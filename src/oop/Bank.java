package oop;

// Note: Invocation of this class is done in ClassesChallenge.java file.
public class Bank {
    private String accountNumber;
    private double balance = 0.0D;
    private String customerName;
    private String email;
    private String phoneNumber;

    public Bank() {
        this("56789", 2.50, "Default Name", "Default Email", "Default Phone");
        System.out.println("Empty constructor called");
    }

    public Bank(String accountNumber, double balance, String customerName, String email, String phoneNumber) {
        System.out.println("Account constructor with params called");
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public Bank(String customerName, String email, String phoneNumber) {
        this("99999", 100.55, customerName, email, phoneNumber);
        // this.customerName = customerName;
        // this.email = email;
        // this.phoneNumber = phoneNumber;
    }

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

    public String getAccountNumber() {
        return this.accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
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
