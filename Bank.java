public class Bank {
    private Account[] accounts;
    private int dividend;

    public Bank(Account[] accounts, int dividend) {
        this.accounts = accounts;
        this.dividend = dividend;
    }
    
    
    public void update() {
        for(Account acc:accounts) {
            if (acc instanceof SavingsAccount) {
                acc.calculateInterest();
                
            }
        }
    }

    public void calculateInterest() {
        
    }

    public void openAccount(Account newAccount) {
        Account[] temp = new Account[accounts.length+1];

        for(int i = 0; i < accounts.length-1; i++) {
            temp[i] = accounts[i];
        }
        temp[temp.length-1] = newAccount;

        accounts = temp;
    }
    
    // public void closeAccount() {
    //     Account[] temp = new Account[accounts.length-1];

    //     for(int i = 0; i < accounts.length-1; i++) {
    //         if (accounts[i].getAccountNumber() = )
    //     }
    // }


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