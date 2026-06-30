package Banking;

public class Account<T> {
    private T type;
    private double balance;

    public Account(T type, double balance) {
        this.type = type;
        this.balance = balance;
    }

    public String getSummary(){
        return "An account of type " + type + " has balance of " + balance;
    }

    public T getTypeDetails(){
        return this.type;
    }

    @Override
    public String toString() {
        return "Account{" +
                "type=" + type +
                ", balance=" + balance +
                '}';
    }
}
