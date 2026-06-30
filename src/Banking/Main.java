package Banking;

public class Main {
    public static void main(String[] args) {
        Current cent = new Current(50000);
        Savings bsbda = new Savings(10);
        Account<Current> currentAccount = new Account<>(cent, 10000);
        Account<Savings> savingsAccount = new Account<>(bsbda, 1030);

        Bank hdfc = new Bank("mail@hdfcbank.com", "chakdah", "HDFC Bank");
        hdfc.addAccount(currentAccount); // This results in a compile error; previously it was outside main static method, cause AM a dumbass
        hdfc.addAccount(savingsAccount);
        var hdfcAcc = hdfc.getAccounts();
        System.out.println("HDFC accounts: ");
        System.out.println(hdfcAcc);

        Bank sbi = new Bank("mail@sbi.com", "chakdah", "SBI Bank");
        sbi.addAccount(new Account<Savings>(new Savings(5), 10352));
        sbi.addAccount(new Account<Savings>(new Savings(2), 2300));
        sbi.addAccount(new Account<Savings>(new Savings(4), 78109));
        sbi.addAccount(new Account<Current>(new Current(5000), 10352));
        sbi.addAccount(new Account<Current>(new Current(10000), 6573));
        sbi.addAccount(new Account<Current>(new Current(10349), 349));
        var sbiAcc = sbi.getAccounts();
        System.out.println("SBI accounts: ");
        System.out.println(sbiAcc);
        getAccountInList(sbi);
    }

    private static void getAccountInList(Bank bank){
        for (var acc: bank.getAccounts()){
            System.out.println(acc.toString());
        }
    }
}
