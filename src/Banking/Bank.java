package Banking;

import java.util.ArrayList;
import java.util.List;

public class Bank {
    private List<Account<?>> accounts = new ArrayList<>();
    private String bankName;
    private String branchName;
    private String branchEmail;

    public Bank(String branchEmail, String branchName, String bankName) {
        this.branchEmail = branchEmail;
        this.branchName = branchName;
        this.bankName = bankName;
    }

    public void addAccount(Account<?> acc){
        if (!accounts.contains(acc)){
            accounts.add(acc);
        }
    }

    public List<Account<?>> getAccounts(){
        return this.accounts;
    }
}
