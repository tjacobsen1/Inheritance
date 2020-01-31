public class SavingsAccount extends Account {
    private double interest;


    public SavingsAccount(int a, double interest) {
        super(a);
        this.interest = interest;
    }

    public double getInterest() {
        interest = getBalance() * 0.08;
        return interest;

        
    }

    public double addInterestToSavingsAccounts() {
        return getBalance() + getInterest();
    }


}