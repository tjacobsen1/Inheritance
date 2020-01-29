public class CurrentAccount extends Account {
    private int overdraftLimit;

    public CurrentAccount(int a, int overdraftLimit) {
        super(a);
        this.overdraftLimit = overdraftLimit;
    }

    public int getOverDraftLimit() {
        return this.overdraftLimit;
    }

    public boolean overDrafted() {
        if (getBalance() > overdraftLimit) {
            return overDrafted = true;
        } else {
            return overDrafted = false;
        }
    }
}