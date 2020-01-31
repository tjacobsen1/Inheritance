public class CurrentAccount extends Account {
    public CurrentAccount(int a) {
        super(a);
    }

    public boolean overDrafted() {
        if (getBalance() <= 0) {
            return true; }
        else {
            return false;
        }
    }
}