package Banking;

public record Savings(int interestRate){
    @Override
    public String
    toString() {
        return "Savings{" +
                "interestRate=" + interestRate +
                '}';
    }
};
