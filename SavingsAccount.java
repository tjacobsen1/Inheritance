public class SavingsAccount extends Account {
    private double interest;


    public SavingsAccount(int a, double interest) {
        super(a);
        this.interest = interest;
    }

    public double calculateInterest() {
        interest = a * 0.08;
        return interest;
    }
}