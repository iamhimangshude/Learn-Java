package AutoBoxing;

import java.util.ArrayList;

public class Challenge {
    public static void main(String[] args) {
        ArrayList<Double> myTransactions = new ArrayList<>();
        myTransactions.add(100.0);
        myTransactions.add(-10.0);
        myTransactions.add(2050.0);
        myTransactions.add(300.0);
        myTransactions.add(-199.0);
        myTransactions.add(845.0);
        Bank meeHDFC = new Bank("John Doe", myTransactions);

        System.out.println("Avl. balance: " + meeHDFC.getBalance());
        meeHDFC.credit(-100.0);
        meeHDFC.credit(230.56);
        meeHDFC.debit(100.00);
        meeHDFC.printStatement();
    }
}

class Bank{
    private String name;
    private ArrayList<Double> transactions;
    private Double balance=0.0;

    // constructor
    public Bank(String name, ArrayList<Double> transactions){
        this.name = name;
        this.transactions = transactions;
        updateBalance();
    }

    private void updateBalance(){
        for (Double i: transactions){
            this.balance += (i);
        }
    }

    public void credit(Double amt){
        if (amt<0){
            System.out.println("amount must be positive");
            return;
        }
        this.transactions.add(amt);
        this.balance += amt;
        System.out.println("Amount credited successfully");
    }

    public void debit(Double amt){
        if (amt < 0){
            System.out.println("amount must be positive");
            return;
        }
        if (this.balance<amt){
            System.out.println("Insufficient balance");
            return;
        }
        this.transactions.add((0-amt));
        this.balance -= amt;
        System.out.println("Amount debited successfully");
    }

    public void setTransactions(Double... amt){
        for (Double i:amt){
            this.transactions.add(i);
            this.balance += (i);
        }
        System.out.println("transactions updated successfully!");
    }

    public ArrayList<Double> getTransactions(){
        return this.transactions;
    }

    public Double getBalance(){
        return this.balance;
    }

    public void printStatement(){
        System.out.println("Customer: " + this.name);
        System.out.print("List of transactions: " + this.transactions);

    }
}
