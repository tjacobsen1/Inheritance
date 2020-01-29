public class Bank {
    private Account[] accounts;
    private int dividend;


    public double addInterestToSavingsAccounts() {
        return this.getBalance()  + interest;
    }


    public void update() {
        for(Account acc:accounts) {
            if (acc instanceof SavingsAccount) {
                acc.calculateInterest();
                
            }
        }
    }
    public void openAccount() {

    }

    public void closeAccount() {

    }


    public double sendOverdraftLetter() {
        if (overDrafted()) {
            return "you have overdrafted your account";
        } else {
            return "you are " + (overDraftLimit - getBalance()) + "away from overdrafting.";
        }
    }

    public int getDividend() {
        return this.dividend;
    }

    public double payDividend() {
        return getBalance() - getDividend();
    }

    
}